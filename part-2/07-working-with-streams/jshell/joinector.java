/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 7 - Working With Streams
 */

import java.util.StringJoiner;
import java.util.stream.Collector;

var delimiter = ",";

Collector<CharSequence, StringJoiner, String> joinector =
  Collector.of(() -> new StringJoiner(delimiter), // supplier
               StringJoiner::add,                 // accumulator
               StringJoiner::merge,               // combiner
               StringJoiner::toString);           // finisher
