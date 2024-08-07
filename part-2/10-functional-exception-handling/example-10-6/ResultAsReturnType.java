//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 10 - Functional Exception Handling
//
// Example 10-6. Using Result<V, E> as a return type
//

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ResultAsReturnType {

    record Result<V, E extends Throwable> (V value,
                                           E throwable,
                                           boolean isSuccess) {

        static <V, E extends Throwable> Result<V, E> success(V value) {
            return new Result<>(value, null, true);
        }

        static <V, E extends Throwable> Result<V, E> failure(E throwable) {
            return new Result<>(null, throwable, false);
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
        var result = Stream.of(Paths.get("example-10-6/ResultAsReturnType.java"),
                               Paths.get("invalid"),
                               Paths.get("example-10-6/result-as-return-type.jsh"))
                           .map(ResultAsReturnType::safeReadString)
                           .filter(Result::isSuccess)
                           .count();

        System.out.println("files count = " + result);
    }
}
