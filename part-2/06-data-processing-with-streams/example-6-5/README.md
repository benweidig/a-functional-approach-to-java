# Example 6-5. Simplified Stream creation for Collection<E>-based types

This example highlights the barebone setup for creating Streams with `Collection<E>`-based data structures, provided by `default` methods.

```java
public interface Collection<E> extends Iterable<E> {

    default Stream<E> stream() {
        return StreamSupport.stream(spliterator(), false);
    }

    default Stream<E> parallelStream() {
        return StreamSupport.stream(spliterator(), true);
    }

    @Override
    default Spliterator<E> spliterator() {
        return Spliterators.spliterator(this, 0);
    }

    // ...
}
```
