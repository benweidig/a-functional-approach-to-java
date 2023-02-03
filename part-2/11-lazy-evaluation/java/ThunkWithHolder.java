/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 11 - Lazy Evaluation
 *
 * Example 11-7. Thunk<T> with synchronized evaluation
 */

import java.util.function.Supplier;

public class ThunkWithHolder {

    public static class Thunk<T> implements Supplier<T> {

        private static class Holder<T> implements Supplier<T> {

            private final T value;

            Holder(T value) {
                this.value = value;
            }

            @Override
            public T get() {
                return this.value;
            }
        }

        private Supplier<T> holder;

        private Thunk(Supplier<T> expression) {
            this.holder = () -> evaluate(expression);
        }

        public static <T> Thunk<T> of(Supplier<T> expression) {
            return new Thunk<>(expression);
        }

        private synchronized T evaluate(Supplier<T> expression) {
            if ((this.holder instanceof Holder) == false) {
                var evaluated = expression.get();
                this.holder = new Holder<>(evaluated);
            }
            return this.holder.get();
        }

        @Override
        public T get() {
            return this.holder.get();
        }
    }
}
