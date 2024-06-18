//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 13 - Asynchronous Tasks
//
// Example 13-2. CompletableFuture creation with convenience methods
//

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

public class CreationConvenience {

    public static void main(String... args) {

        // Future<T>

        var executorService = ForkJoinPool.commonPool();

        Future<?> futureRunnable =
            executorService.submit(() -> System.out.println("not returning a value"));

            Future<String> futureCallable =
            executorService.submit(() -> "Hello, Async World!");

        // CompleteableFuture<T>

        CompletableFuture<Void> completableFutureRunnable =
        CompletableFuture.runAsync(() -> System.out.println("not returning a value"));

        CompletableFuture<String> completableFutureSupplier =
        CompletableFuture.supplyAsync(() -> "Hello, Async World!");
    }
}
