# Example 3-4. Simplified Function<T, R> interface

This example is for illustrating purposes only

```java
@FunctionalInterface
public interface Function<T, R> {

    default <V> Function<V, R> compose(Function<V, T> before) {
        Objects.requireNonNull(before);

        return (V v) -> {
            T result = before.apply(v);
            return apply(result);
        };
    }

    // ...
}
```
