//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 13 - Asynchronous Tasks
//
// Example 13-5. Either operations and rejected stages
//

import java.util.concurrent.CompletableFuture;

CompletableFuture<String> notFailed =
    CompletableFuture.supplyAsync(() -> "Success!");

CompletableFuture<String> failed =
    CompletableFuture.supplyAsync(() -> { throw new RuntimeException(); });


// NO OUTPUT BECAUSE THE PREVIOUS STAGE FAILED
var rejected = failed.acceptEither(notFailed, System.out::println);

// OUTPUT BECAUSE THE PREVIOUS STAGE COMPLETED NORMALLY
var resolved = notFailed.acceptEither(failed, System.out::println);
