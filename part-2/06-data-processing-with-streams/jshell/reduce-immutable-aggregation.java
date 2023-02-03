/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 6 - Data Processing with Streams
 *
 * Example 6-12. Immutable accumulation of numbers with a Stream
 */

import java.util.ArrayList;
import java.util.stream.Stream;

var numbers = List.of(1, 2, 3, 4, 5, 6);

int total = numbers.stream()
                   .reduce(0, Integer::sum);
