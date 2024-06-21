//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 10 - Functional Exception Handling
//

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

record Result<V, E extends Throwable> (V value, E throwable, boolean isSuccess) {

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
        return this.isSuccess ? successFn.apply(this.value) //
                                : failureFn.apply(this.throwable);
    }

    void ifSuccess(Consumer<? super V> action) {
        if (this.isSuccess) {
            action.accept(this.value);
        }
    }

    void ifFailure(Consumer<? super E> action) {
        if (!this.isSuccess) {
            action.accept(this.throwable);
        }
    }

    void handle(Consumer<? super V> successAction,
                        Consumer<? super E> failureAction) {
        if (this.isSuccess) {
            successAction.accept(this.value);
        } else {
            failureAction.accept(this.throwable);
        }
    }

    V orElse(V other) {
        return this.isSuccess ? this.value 
                              : other;
    }

    V orElseGet(Supplier<? extends V> otherSupplier) {
        return this.isSuccess ? this.value
                              : otherSupplier.get();
    }

    private <E extends Throwable> void sneakyThrow(Throwable e) throws E {
        throw (E) e;
    }

    V orElseThrow() {
        if (!this.isSuccess) {
            sneakyThrow(this.throwable);
            return null;
        }

        return this.value;
    }
}

Result<String, IOException> safeReadString(Path path) {
    try {
        return Result.success(Files.readString(path));
    }
    catch (IOException e) {
        return Result.failure(e);
    }
}

safeReadString(Paths.get("result-reactions.java")).handle(
    success -> System.out.println("Success!"),
    failure -> System.out.println("IO-Error: " + failure.getMessage())
);

System.out.println("");

safeReadString(Paths.get("invalid")).handle(
    success -> System.out.println("Success!"),
    failure -> System.out.println("IO-Error: " + failure.getMessage())
);
