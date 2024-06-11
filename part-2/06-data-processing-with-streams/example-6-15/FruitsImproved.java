//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 6 - Data Processing with Streams
//
// Example 6-15. Fruit pipeline (naïve)
//

import java.util.stream.Stream;

public class FruitsImproved {

      public static void main(String args) {
            Stream.of("ananas", "oranges", "apple", "pear", "banana")
                  .filter(s -> s.startsWith("a"))
                  .map(String::toUpperCase)
                  .sorted()
                  .forEach(System.out::println);
      }
}
