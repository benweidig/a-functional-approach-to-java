//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 6 - Data Processing with Streams
//

import java.util.stream.Stream;

public class ShortCircuitingNotDropped {

    public static void main(String... args) {

        var result = Stream.of("apple", "orange", "banana", "melon")
                           .filter(str -> str.contains("e"))
                           .peek(str -> System.out.println("peek 1: " + str))
                           .map(str -> {
                               System.out.println("map: " + str);
                               return str.toUpperCase();
                           })
                           .peek(str -> System.out.println("peek 2: " + str))
                           .count();

        System.out.println(result);
    }
}
