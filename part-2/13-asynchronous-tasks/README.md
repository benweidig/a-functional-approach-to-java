# Chapter 13: Asynchronous Tasks

## Java Futures

### Example 13-1. Future&lt;T> flow of execution

Executing a `Callable<T>` as a `Future<T>`.

[Example 13-1](example-13-1)


## Designing Asynchronous Pipelines with CompletableFuture<T>

### Example 13-2. CompletableFuture creation with convenience methods

How to use convenience creation methods.

[Example 13-2](example-13-2)

### Example 13-3. Async bookmark manager workflow

Theoretical workflow of an async bookmark manager.

```java
var task = CompletableFuture.supplyAsync(() -> this.downloadService.get(url))
                            .thenApply(this.contentCleaner::clean)
                            .thenRun(this.storage::save);
```

### Example 13-4. Unwrapping nested stages

Working with nested stages.

[Example 13-4](example-13-4)

### Example 13-5. Either operations and rejected stages

Dealing with failed futures.

[Example 13-5](example-13-5)

### Example 13-6. Complete implementation of eachOf

Java class of CompletableFuture helper class.

[Example 13-6](example-13-6)

### Example 13-7. Refactored implementation of Futures with eachOf and bestEffort

The previous Java class in a more refined/refactored form.

[Example 13-7](example-13-7)


## Manual Creation and Completion

### Example 13-8. Cached WeatherService with CompletableFuture

Weather service design using CompletableFutures.

[Example 13-8](example-13-8)

### Example 13-9. ImageProcessor with unsettled CompletableFuture

Unfinished image processor design using CompletableFutures.

[Example 13-9](example-13-9)
