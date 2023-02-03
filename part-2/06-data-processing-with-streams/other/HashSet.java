/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 6 - Data Processing with Streams
 *
 * Example 6-3. Spliterator characteristics of HashSet<T>
 */

// EXCERPT FROM java.util.HashMap

public int characteristics() {
    return (fence < 0 || est == map.size ? Spliterator.SIZED : 0) |
                Spliterator.DISTINCT;
}
