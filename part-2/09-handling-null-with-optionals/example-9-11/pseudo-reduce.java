//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 9 - Handling null with Optionals
//
// Example 9-11. Pseudo-code equivalent to the reduce operation
//

import java.util.functional.BinaryOperator;
import java.util.Optional;

Optional<T> pseudoReduce(BinaryOperator<T> accumulator) {
    boolean foundAny = false;
    T result = null;

    for (T element : elements) {
        if (!foundAny) {
            foundAny = true;
            result = element;
        } else {
            result = accumulator.apply(result, element);
        }
    }

    return foundAny ? Optional.of(result)
                    : Optional.empty();
}
