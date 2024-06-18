//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 13 - Asynchronous Tasks
//
// Example 13-7. Refactored implementation of Futures with eachOf and bestEffort
//

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Predicate;

public final class CompletableFutures {

    private final static Predicate<CompletableFuture<?>> EXCEPTIONALLY =
        Predicate.not(CompletableFuture::isCompletedExceptionally);

    private static <T> Function<Void, List<T>> gatherResultsFn(CompletableFuture<T>... cfs) {

        return unused -> Arrays.stream(cfs)
                               .filter(Predicate.not(CompletableFutures.EXCEPTIONALLY))
                               .map(CompletableFuture::join)
                               .toList();
    }

    public static <T> CompletableFuture<List<T>> eachOf(CompletableFuture<T>... cfs) {
        return CompletableFuture.allOf(cfs)
                                .thenApply(gatherResultsFn(cfs));
    }

    public static <T> CompletableFuture<List<T>> bestEffort(CompletableFuture<T>... cfs) {
        return CompletableFuture.allOf(cfs)
                                .exceptionally(ex -> null)
                                .thenApply(gatherResultsFn(cfs));
    }

    private CompletableFutures() {
        // SUPPRESS DEFAULT CONSTRUCTOR
    }
}
