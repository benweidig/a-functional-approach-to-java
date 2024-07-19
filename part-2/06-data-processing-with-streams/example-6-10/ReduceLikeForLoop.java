//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 6 - Data Processing with Streams
//
// Example 6-10. Reduce-like for-loop
//

import java.util.Collection;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceLikeForLoop {

    private static <T> T reduce(Collection<T> elements,
                                T initialValue,
                                BinaryOperator<T> accumulator) {

        T result = initialValue;

        for (T element : elements) {
            result = accumulator.apply(result, element);
        }

        return result;
    }

    private static Integer max(Collection<Integer> numbers) {
        return reduce(numbers,
                      Integer.MIN_VALUE,
                      Math::max);
    }

    public static void main(String[] args) {

        List<Integer> numbers = List.of(3, 1_234, 999, 42, -23, 0);

        var result = max(numbers);

        System.out.println("max number = " + result);
    }
}
