//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 6 - Data Processing with Streams
//
// Example 6-11. Three-arguments reduce() versus map + two-arguments reduce
//

import java.util.stream.Stream;

Integer reduceOnly = Stream.of("apple", "orange", "banana")
                           .reduce(0,
                                   (acc, str) -> acc + str.length(),
                                   Integer::sum);


int mapReduce = Stream.of("apple", "orange", "banana")
                      .mapToInt(String::length)
                      .reduce(0, (acc, length) -> acc + length);
