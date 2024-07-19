//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 6 - Data Processing with Streams
//
// Example 6-9. Finding the max number of a collection
//

import java.util.Collection
import java.util.List

Integer max(Collection<Integer> numbers) {
    int result = Integer.MIN_VALUE;

    for (var value : numbers) {
        result = Math.max(result, value);
    }
 
    return result;
}


var numbers = List.of(3, 1_234, 999, 42, -23, 0)

var result = max(numbers)

System.out.println("Max number: " + result)
