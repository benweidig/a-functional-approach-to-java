//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 8 - Parallel Data Processing with Streams
//
// Example 8-3. Mutable accumulation with a for-loop
//

import java.util.List;

public class MutableAccumulation {

    public static void main(String... args) {

        var numbers = List.of(1, 2, 3, 4, 5, 6);

        int total = 0;

        for (int value : numbers) {
            total += value;
        }

        System.out.println("total = " + total);
    }
}