//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 13 - Asynchronous Tasks
//
// Example 13-9. ImageProcessor with unsettled CompletableFuture
// THIS EXAMPLE IS INCOMPLETE AND FOR ILLUSTRATION PURPOSES ONLY
//

import java.util.concurrent.CompletableFuture;

public class ImageProcessor {

    public record Task(CompletableFuture<Path> start,
                     CompletableFuture<InputStream> end) {
        // NO BODY
    }

    public Task createTask(int maxHeight,
                           int maxWidth,
                           boolean keepAspectRatio,
                           boolean trimWhitespace) {

        var start = new CompletableFuture<Path>();

        var end = unsettled.thenApply(...)
                           .exceptionally(...)
                           .thenApply(...)
                           .handle(...);

        return new Task(start, end);
    }
}
