//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 8 - Parallel Data Processing with Streams
//
// Example 8-4. Immutable accumulation of numbers with a Stream
//

import java.util.stream.Stream;

int total = Stream.of(1, 2, 3, 4, 5, 6)
                  .parallel()
                  .reduce(0,
                          Integer::sum);
