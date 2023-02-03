/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 7 - Working With Streams
 */

import java.util.stream.IntStream;

IntStream.iterate(1,
                  idx -> idx < 5,
                  idx -> idx + 1)
         .forEachOrdered(System.out::println);
