//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 11 - Lazy Evaluation
//
// Example 11-6. Functional additions to Thunk<T>
//

import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class ThunkFunctional {

    public static class Thunk<T> implements Supplier<T> {

        private final Supplier<T> expression;
        private T result;

        private Thunk(Supplier<T> expression) {
            this.expression = expression;
        }

        @Override
        public T get() {
            if (this.result == null) {
                this.result = this.expression.get();
            }
            return this.result;
        }

        public static <T> Thunk<T> of(Supplier<T> expression) {
            if (expression instanceof Thunk<T>) {
                return (Thunk<T>) expression;
            }

            return new Thunk<>(expression);
        }

        public static <T> Thunk<T> of(T value) {
            return new Thunk<T>(() -> value);
        }

        public <R> Thunk<R> map(Function<T, R> mapper) {
            return Thunk.of(() -> mapper.apply(get()));
        }

        public void accept(Consumer<T> consumer) {
            consumer.accept(get());
        }
    }
}
