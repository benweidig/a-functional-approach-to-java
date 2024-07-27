//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 10 - Functional Exception Handling
//
// Example 10-12. Implementing Function<T, Optional<R>>
//

import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.util.Objects
import java.util.Optional
import java.util.function.Function
import java.util.stream.Stream

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

static class Try<T, R> implements Function<T, Optional<R>> {

    private final Function<T, R>                fn;
    private final Function<RuntimeException, R> failureFn;

    static <T, R> Try<T, R> of(ThrowingFunction<T, R> fn) {
        Objects.requireNonNull(fn);

        return new Try<>(fn, null);
    }

    Try(Function<T, R> fn, Function<RuntimeException, R> failureFn) {
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

    @Override
    public Optional<R> apply(T value) {
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

{
                           // ADAPT AS NEEDED
    var result = Stream.of(Paths.get("TryFunction.java"),
                                     Paths.get("invalid"),
                                     Paths.get("try-function.jsh"))
                       .map(fileLoader)
                       .flatMap(Optional::stream)
                       .count();

    System.out.println("files count = " + result);
}
