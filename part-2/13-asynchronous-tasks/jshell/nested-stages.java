/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 13 - Asynchronous Tasks
 *
 * Example 13-4. Unwrapping nested stages
 */

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

// FUTURE<T>

var executorService = ForkJoinPool.commonPool();

Future<?> futureRunnable =
    executorService.submit(() -> System.out.println("not returning a value"));

Future<String> futureCallable =
    executorService.submit(() -> "Hello, Async World!");


// COMPLETABLEFUTURE<T>

CompletableFuture<Void> completableFutureRunnable =
    CompletableFuture.runAsync(() -> System.out.println("not returning a value"));

CompletableFuture<String> completableFutureSupplier =
    CompletableFuture.supplyAsync(() -> "Hello, Async World!");
