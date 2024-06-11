//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 6 - Data Processing with Streams
//
// Example 6-15. Fruit pipeline (naïve)
//

import java.util.stream.Stream;

Stream.of("ananas", "oranges", "apple", "pear", "banana")
      .map(String::toUpperCase) 
      .sorted() 
      .filter(s -> s.startsWith("A")) 
      .forEach(System.out::println);
