/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 13 - Asynchronous Tasks
 *
 * Example 13-8. Cached WeatherService with CompletableFuture
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

record WeatherInfo(int zipCode) {
}

public class WeatherService {

    private final Map<Integer, WeatherInfo> cache = new HashMap<>();

    private Optional<WeatherInfo> cacheLookup(int zipCode) {
        return Optional.ofNullable(this.cache.get(zipCode));
    }

    private WeatherInfo storeInCache(WeatherInfo info) {
        return this.cache.put(info.zipCode(), info);
    }

    private WeatherInfo apiGetWeatherInfo(int zipCode) {
        return new WeatherInfo(zipCode);
    }

    private CompletableFuture<WeatherInfo> restCall(int zipCode) {

        Supplier<WeatherInfo> restCall = () -> apiGetWeatherInfo(zipCode);

        return CompletableFuture.supplyAsync(restCall).thenApply(this::storeInCache);
    }

    public CompletableFuture<WeatherInfo> check(int zipCode) {

        return cacheLookup(zipCode).map(CompletableFuture::completedFuture)
                                   .orElseGet(() -> restCall(zipCode));
    }
}
