# Example 6-4. Spliterator characteristics of HashSet

This example only shows a single method extracted from `java.util.HashSet`.

```java
public int characteristics() {
    return (fence < 0 || est == map.size ? Spliterator.SIZED : 0) |
                Spliterator.DISTINCT;
}
```
