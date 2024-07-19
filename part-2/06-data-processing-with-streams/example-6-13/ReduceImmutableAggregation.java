//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 6 - Data Processing with Streams
//
// Example 6-13. Immutable accumulation of numbers with a Stream
//

import java.util.List;

public class ReduceImmutableAggregation {

    public static void main(String[] args) {

        var numbers = List.of(1, 2, 3, 4, 5, 6);
        
        int total = numbers.stream()
                           .reduce(0, Integer::sum);
        
        System.out.println("total = " + total);
    }
}
