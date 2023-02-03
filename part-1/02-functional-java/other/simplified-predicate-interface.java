/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 2 - Functional Java
 *
 * Example 2-2. Simplified java.util.functional.Predicate<T>
 *
 * This is a simplified and non-working version of
 * java.util.function.Predicate<T> to illustrate the mix of a
 * single-abstract method and default and static methods.
 *
 * [Original Source](https://github.com/openjdk/jdk/blob/dfacda488bfbe2e11e8d607a6d08527710286982/src/java.base/share/classes/java/util/function/Predicate.java)
 */

package java.util.function;

// Thy type uses this annotation even though it's not explicitly required
@FunctionalInterface
public interface Predicate<T> {

    // The single abstract method
    boolean test(T t);


    // There are 3 additional default method available

    default Predicate<T> and(Predicate<? super T> other) {
        // ...
    }

    default Predicate<T> negate() {
        // ...
    }

    default Predicate<T> or(Predicate<? super T> other) {
        // ...
    }


    // There are 2 additional static methods available

    static <T> Predicate<T> isEqual(Object targetRef) {
        // ...
    }

    static <T> Predicate<T> not(Predicate<? super T> target) {
        // ...
    }
}