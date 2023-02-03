/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 3 - Functional JDK
 */

@FunctionalInterface
public interface TriFunction<T, U, V, R> {

    R accept(T t, U u, V, v);
}
