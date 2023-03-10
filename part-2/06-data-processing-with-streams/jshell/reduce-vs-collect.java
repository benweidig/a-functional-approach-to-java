/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 6 - Data Processing with Streams
 *
 * Example 6-13. Concatenating String elements with reduce and collect
 */

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

var strings = List.of("a", "b", "c", "d", "e");

// STREAM REDUCE

var reduced = strings.stream()
                     .reduce("", String::concat);


// STREAM COLLECT - CUSTOM

var joiner =strings.stream()
                   .collect(Collector.of(() -> new StringJoiner(""),
                                         StringJoiner::add,
                                         StringJoiner::merge,
                                         StringJoiner::toString));

// STREAM COLLECT - PRE-DEFINED

var collectWithCollectors = strings.stream()
                                   .collect(Collectors.joining());
