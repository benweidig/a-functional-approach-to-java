//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 10 - Functional Exception Handling
//
// Example 10-9. Minimal Try<T, R> accepting a lambda and Exception handler
//

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import java.util.function.Function;

public class TryMinimal {

    @FunctionalInterface
    interface ThrowingFunction<T, U> extends Function<T, U> {

        U applyThrows(T elem) throws Exception;

        @Override
        default U apply(T t) {
            try {
                return applyThrows(t);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        static <T, U> Function<T, U> uncheck(ThrowingFunction<T, U> fn) {
            return fn::apply;
        }
    }

    static class Try<T, R> {

        private final Function<T, R>                fn;
        private final Function<RuntimeException, R> failureFn;

        static <T, R> Try<T, R> of(ThrowingFunction<T, R> fn) {
            Objects.requireNonNull(fn);

            return new Try<>(fn, null);
        }

        private Try(Function<T, R> fn, Function<RuntimeException, R> failureFn) {
            this.fn = fn;
            this.failureFn = failureFn;
        }
    }

    public static void main(String... args) {
        var trySuccessFailure = Try.<Path, String> of(Files::readString);
    }
}
