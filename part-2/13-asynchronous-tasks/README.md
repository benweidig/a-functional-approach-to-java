# Chapter 13: Asynchronous Tasks

## Java Futures

### Example 13-1. Future&lt;T> flow of execution

Java code executing a `Callable<T>` as a `Future<T>`.

[`java/FutureFlowOfExecution.java`](java/FutureFlowOfExecution.java)


## Designing Asnychronous Pipelines with CompletableFuture<T>

### Example 13-2. CompletableFuture creation with convenience methods

JShell script of how to use convenience creation methods.

[`jshell/creation-convenience.java`](jshell/creation-convenience.java)

### Example 13-3. Async bookmark manager workflow

Theoretical workflow of an async bookmark manager.

```java
var task = CompletableFuture.supplyAsync(() -> this.downloadService.get(url))
                            .thenApply(this.contentCleaner::clean)
                            .thenRun(this.storage::save);
```

### Example 13-4. Unwrapping nested stages

JShell script of nested stages.

[`jshell/nested-stages.java`](jshell/nested-stages.java)

### Example 13-5. Either operations and rejected stages

JShell script of Either operations.

[`jshell/either-rejected.java`](jshell/either-rejected.java)

### Example 13-6. Complete implementation of eachOf

Java class of CompletableFuture helper class.

[`java/CompletableFutures.java`](java/CompletableFutures.java)

### Example 13-7. Refactored implementation of Futures with eachOf and bestEffort

The previous Java class in a more refined/refactored form.

[`java/CompletableFuturesRefactored.java`](java/CompletableFuturesRefactored.java)


## Manual Creation and Completion

### Example 13-8. Cached WeatherService with CompletableFuture

JShell script of a weather service design using CompletableFutures.

[`jshell/weather-service.java`](jshell/weather-service.java)

### Example 13-9. ImageProcessor with unsettled CompletableFuture

JShell script of an unfinished image processor design using CompletableFutures.

[`jshell/image-processor.java`](jshell/image-processor.java)

