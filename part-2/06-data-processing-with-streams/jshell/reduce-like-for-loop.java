/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 6 - Data Processing with Streams
 *
 * Example 6-9. Reduce-like for-loop
 */

import java.util.Collection;
import java.util.List;

<T> T reduce(Collection<T> elements,
             T initialValue,
             BinaryOperator<T> accumulator) {

    T result = initialValue;

    for (T element : elements) {
        result = accumulator.apply(result, element);
    }

    return result;
}

Integer max(Collection<Integer> number) {
    return reduce(numbers,
                  Integer.MIN_VALUE,
                  Math::max);
}

var numbers = List.of(3, 1234, 999, 42, -23, 0);

max(numbers);