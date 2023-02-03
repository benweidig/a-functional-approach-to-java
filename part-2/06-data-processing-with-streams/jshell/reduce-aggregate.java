/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 6 - Data Processing with Streams
 *
 * Example 6-11. Aggregate elements with the reduce operation
 */

import java.util.ArrayList;
import java.util.stream.Stream;

var fruits = Stream.of("apple", "orange", "banana", "peach")
                   // Any additional operations.
                   // This example only highlights the
                   // aggregation aspect.
                   .reduce(new ArrayList<>(), 
                           (acc, fruit) -> {
                             var list = new ArrayList<>(acc); 
                             list.add(fruit);
                             return list;
                   },
                   (lhs, rhs) -> {
                     var list = new ArrayList<>(lhs);
                     list.addAll(rhs);
                     return list;
                   });
