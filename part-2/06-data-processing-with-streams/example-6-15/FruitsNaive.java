//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 6 - Data Processing with Streams
//
// Example 6-15. Fruit pipeline (naïve)
//

import java.util.stream.Stream;

public class FruitsNaive {

      public static void main(String... args) {
            Stream.of("ananas", "oranges", "apple", "pear", "banana")
                  .map(String::toUpperCase)
                  .sorted()
                  .filter(s -> s.startsWith("A"))
                  .forEach(System.out::println);
      }
}
