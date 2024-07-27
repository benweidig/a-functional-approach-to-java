//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 10 - Functional Exception Handling
//
// Example 10-2. Unchecking java.util.Function
//

import java.io.IOException
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.util.Objects
import java.util.function.Function
import java.util.stream.Stream


// Wrapped in class so we can use the interface and a method reference more easily
class UncheckingExceptions {

    @FunctionalInterface
    interface ThrowingFunction<T, U> extends Function<T, U> {

        U applyThrows(T elem) throws Exception;

        @Override
        default U apply(T t) {
            try {
                return applyThrows(t);
            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        static <T, U> Function<T, U> uncheck(ThrowingFunction<T, U> fn) {
            return fn::apply;
        }
    }

    static String safeReadString(Path path) {
        try {
            return Files.readString(path);
        }
        catch (IOException e) {
            return null;
        }
    }
}

{
                                     // ADAPT AS NECESSARY
    var result = Stream.of(Paths.get("UncheckingExceptions.java"),
                           Paths.get("unchecking-exceptions.jsh"))
                        .map(UncheckingExceptions::safeReadString)
                        .filter(Objects::nonNull)
                        .count();

    System.out.println("files count = " + result);
}
