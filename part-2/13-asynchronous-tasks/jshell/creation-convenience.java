/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 13 - Asynchronous Tasks
 *
 * Example 13-2. CompletableFuture creation with convenience methods
 */

import java.util.concurrent.CompletableFuture;

CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> 42);
CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> 23);

BiFunction<Integer, Integer, CompletableFuture<Integer>> task =
    (lhs, rhs) -> CompletableFuture.supplyAsync(() -> lhs + rhs);

CompletableFuture<Integer> combined =
    future1.thenCombine(future2, task)
           .thenCompose(Function.identity());

var result = combined.get();