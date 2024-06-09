import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 3 - Functional JDK
 *
 * Example 3-6. Using the functional compositor
 */
public class CompositorUsage {

    public static void main(String... args) {

        // COMPOSE

        Function<String, String> removeLowerCaseA = str -> str.replace("a", "");
        Function<String, String> upperCase = String::toUpperCase;

        // Composed String Functions
        Function<String, String> stringOperations = removeLowerCaseA.andThen(upperCase);

        // Composed String Functions and Consumer
        Consumer<String> composedConsumer = Compositor.compose(stringOperations, System.out::println);

        composedConsumer.accept("abcd");

        // ACCEPTIF

        Consumer<String> acceptIfNotNull = Compositor.acceptIf(str -> str != null, System.out::println);

        acceptIfNotNull.accept("this is printed");
        acceptIfNotNull.accept(null);
    }

    static class Compositor {

        static <T, R> Supplier<R> compose(Supplier<T> before, Function<T, R> fn) {
            Objects.requireNonNull(before);
            Objects.requireNonNull(fn);

            return () -> {
                T result = before.get();
                return fn.apply(result);
            };
        }

        static <T, R> Consumer<T> compose(Function<T, R> fn, Consumer<R> after) {
            Objects.requireNonNull(fn);
            Objects.requireNonNull(after);

            return (T t) -> {
                R result = fn.apply(t);
                after.accept(result);
            };
        }

        static <T> Consumer<T> acceptIf(Predicate<T> predicate, Consumer<T> consumer) {
            Objects.requireNonNull(predicate);
            Objects.requireNonNull(consumer);

            return (T t) -> {
                if (!predicate.test(t)) {
                    return;
                }
                consumer.accept(t);
            };
        }

        private Compositor() {
            // disallows direct instantiation
        }
    }
}
