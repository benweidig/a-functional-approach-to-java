//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 13 - Asynchronous Tasks
//
// Example 13-4. Unwrapping nested stages
//

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.BiFunction;
import java.util.function.Function;

CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> 42);
CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> 23);

BiFunction<Integer, Integer, CompletableFuture<Integer>> task =
    (lhs, rhs) -> CompletableFuture.supplyAsync(() -> lhs + rhs);

CompletableFuture<Integer> combined =
    future1.thenCombine(future2, task)
           .thenCompose(Function.identity());

var result = combined.get();