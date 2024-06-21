//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 10 - Functional Exception Handling
//
// Example 10-7. Adding Transformers to Result<V, E>
//

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

public class ResultTransformers {

    record Result<V, E extends Throwable>(V value, E throwable, boolean isSuccess) {

        static <V, E extends Throwable> Result<V, E> success(V value) {
            return new Result<>(value, null, true);
        }

        static <V, E extends Throwable> Result<V, E> failure(E throwable) {
            return new Result<>(null, throwable, false);
        }

        <R> Optional<R> mapSuccess(Function<V, R> fn) {
            return this.isSuccess ? Optional.ofNullable(this.value).map(fn)
                                  : Optional.empty();
        }

        <R> Optional<R> mapFailure(Function<E, R> fn) {
            return this.isSuccess ? Optional.empty()
                                  : Optional.ofNullable(this.throwable).map(fn);
        }

        <R> R map(Function<V, R> successFn, Function<E, R> failureFn) {
            return this.isSuccess ? successFn.apply(this.value)
                                  : failureFn.apply(this.throwable);
        }
    }

    static Result<String, IOException> safeReadString(Path path) {
        try {
            return Result.success(Files.readString(path));
        }
        catch (IOException e) {
            return Result.failure(e);
        }
    }

    public static void main(String... args) {
        // HANDLE ONLY SUCCESS CASE
        var successOnly = Stream.of(Paths.get("ResultTransformers.java"),
                                    Paths.get("invalid"),
                                    Paths.get("result-transformers.java"))
                                .map(ResultTransformers::safeReadString)
                                .map(result -> result.mapSuccess(String::toUpperCase)).flatMap(Optional::stream)
                                .toList();

        System.out.println("Found (successOnly): " + successOnly.size());

        // HANDLE BOTH CASES
        var result = safeReadString(Paths.get("invalid")).map(success -> success.toUpperCase(),
                                                              failure -> "IO-Error: " + failure.getMessage());

        System.out.println("Result: " + result);
    }
}
