//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 6 - Data Processing with Streams
//
// Example 6-14. Concatenating String elements with reduce and collect
//

import java.util.List
import java.util.StringJoiner
import java.util.stream.Collector
import java.util.stream.Collectors

var strings = List.of("a", "b", "c", "d", "e")

// STREAM REDUCE
var reduced = strings.stream() .reduce("", String::concat)
System.out.println("reduced = " + reduced)


// STREAM COLLECT - CUSTOM
{
    var joiner = strings.stream()
                        .collect(Collector.of(() -> new StringJoiner(""),
                                              StringJoiner::add,
                                              StringJoiner::merge,
                                              StringJoiner::toString));

    System.out.println("joiner = " + joiner);
}

// STREAM COLLECT - PRE-DEFINED
{
    var collectWithCollectors = strings.stream()
                                       .collect(Collectors.joining());

    System.out.println("collectWithCollectors = " + collectWithCollectors);
}
