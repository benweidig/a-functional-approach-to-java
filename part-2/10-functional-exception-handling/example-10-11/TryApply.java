//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 10 - Functional Exception Handling
//
// Example 10-11. Applying a value to Try
//

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;

public class TryApply {

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

        Try<T, R> success(Function<R, R> successFn) {
            Objects.requireNonNull(successFn);

            var composedFn = this.fn.andThen(successFn);
            return new Try<>(composedFn, this.failureFn);
        }

        Try<T, R> failure(Function<RuntimeException, R> failureFn) {
            Objects.requireNonNull(failureFn);

            return new Try<>(this.fn, failureFn);
        }

        Optional<R> apply(T value) {
            try {
                var result = this.fn.apply(value);
                return Optional.ofNullable(result);
            }
            catch (RuntimeException e) {
                if (this.failureFn != null) {
                    var result = this.failureFn.apply(e);
                    return Optional.ofNullable(result);
                }
            }

            return Optional.empty();
        }
    }

    public static void main(String... args) {
        var path = Paths.get("TryApply.java");
        Optional<String> result =
            Try.<Path, String> of(Files::readString)
                              .success(String::toUpperCase)
                              .failure(str -> null)
                              .apply(path);

        System.out.println("resulst = " + result);
    }
}
