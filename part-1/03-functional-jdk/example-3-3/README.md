# Example 3-3. default method hierarchy

This example is for illustrating purposes only

```java
public interface Iterable<T> {

    default Spliterator<T> spliterator() {
        return Spliterators.spliteratorUnknownSize(iterator(), 0);
    }

    // ...
}


public interface Collection<E> extends Iterable<E> {

    @Override
    default Spliterator<E> spliterator() {
        return Spliterators.spliterator(this, 0);
    }

    // ...
}


public class ArrayList<E> extends AbstractList<E> implements List<E>, ... {

    @Override
    public Spliterator<E> spliterator() {
        return new ArrayListSpliterator(0, -1, 0);
    }

    // ...
}
```
