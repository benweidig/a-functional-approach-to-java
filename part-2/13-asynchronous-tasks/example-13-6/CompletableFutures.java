//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 13 - Asynchronous Tasks
//
// Example 13-6. Complete implementation of eachOf
//

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Predicate;

public class CompletableFutures {

    private static final Predicate<CompletableFuture<?>> EXCEPTIONALLY =
        Predicate.not(CompletableFuture::isCompletedExceptionally);

    public static <T> CompletableFuture<List<T>> eachOf(CompletableFuture<T>... cfs) {

        Function<Void, List<T>> fn =
            unused -> Arrays.stream(cfs)
                            .filter(Predicate.not(CompletableFutures.EXCEPTIONALLY))
                            .map(CompletableFuture::join)
                            .toList();

        return CompletableFuture.allOf(cfs).thenApply(fn);
    }

    public static <T> CompletableFuture<List<T>> bestEffort(CompletableFuture<T>... cfs) {

        Function<Void, List<T>> fn =
            unused -> Arrays.stream(cfs)
                            .filter(Predicate.not(CompletableFutures.EXCEPTIONALLY))
                            .map(CompletableFuture::join)
                            .toList();

        return CompletableFuture.allOf(cfs)
                                .exceptionally(ex -> null)
                                .thenApply(fn);
    }

    private CompletableFutures() {
        // SUPPRESS DEFAULT CONSTRUCTOR
    }
}
