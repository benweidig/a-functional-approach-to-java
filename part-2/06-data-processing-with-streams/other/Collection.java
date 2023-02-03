/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 6 - Data Processing with Streams
 *
 * Example 6-4. Simplified Stream creation for Collection types
 */

// EXCERPT FROM java.util.Collection

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
