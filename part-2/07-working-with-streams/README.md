# Chapter 7: Working With Streams

## Iterative Streams

JShell scripts shwoing three variants of an iteration:

* `for`-loop
* `Stream.iterate`
* `IntStream.iterate` (Java 9+)

[`jshell/iterative-stream-for-loop.java`](jshell/iterative-stream-for-loop.java)  
[`jshell/iterative-stream-intstream-iterate-java8.java`](jshell/iterative-stream-for-loop.java)  
[`jshell/iterative-stream-intstream-iterate-java9.java`](jshell/iterative-stream-for-loop.java)

## Infinite Streams

JShell script illustrating a generated parallel unordered Stream overshooting its limit.

[`jshell/generative-stream-parallel-unordered.java`](jshell/generative-stream-parallel-unordered.java)


## From Arrays to Streams and Back

### Object-Type Arrays

JShell script showing how to create a `String[]` from a Stream.

[`jshell/arrays-toarray.java`](jshell/arrays-toarray.java)


## Working with File I/O

### Reading Directory Contents

#### Example 7-1. Listing a directory

JShell script listing a directory.
This script must be run in the root directory of the repository, e.g. `jshell < ./part-2/07-working-with-streams/io-listing.java`.

[`jshell/io-listing.java`](jshell/io-listing.java)


### Depth-First Directory Traversal

#### Example 7-2. Walking the Filesystem

JShell script walking a directory.
This script must be run in the root directory of the repository, e.g. `jshell < ./part-2/07-working-with-streams/io-walking.java`.

[`jshell/io-waling.java`](jshell/io-walking.java)


### Searching the Filesystem

#### Example 7-3. Finding Files

JShell script illustrating how to search a directory.
This script must be run in the root directory of the repository, e.g. `jshell < ./part-2/07-working-with-streams/io-searching.java`.

[`jshell/io-searching.java`](jshell/io-searching.java)


### Reading Files Line-By-Line

#### Example 7-4. Counting words in “War and Peace”

JShell script illustrating how to search a directory.
This script must be run in its directory to find the text file.

[`jshell/io-line-by-line.java`](jshell/io-line-by-line.java)

## Dealing with Date and Time

#### Querying Temporal Types

JShell script showing how to query Java Time API types.

[`jshell/time-api-query.java`](jshell/time-api-query.java)


## More about Collectors

### Downstream Collectors

#### Transforming Elements

JShell script showing how to group Stream elements by one of the element's properties.

[`jshell/downstream-transform-groupby-simple.java`](jshell/downstream-transform-groupby-simple.java)

JShell script showing how to group Stream elements with a downstream Collector to map grouped elements.

[`jshell/downstream-transform-groupby-mapping.java`](jshell/downstream-transform-groupby-mapping.java)

JShell script illustrating how to extract a downstream collector to keep things simpler.

[`jshell/downstream-transform-groupby-mapping-variable.java`](jshell/downstream-transform-groupby-mapping-variable.java)

#### Reducing Elements

JShell script showing how to sum up logs with nested downstream Collectors.

[`jshell/downstream-reduce-sum-up.java`](jshell/downstream-reduce-sum-up.java)

JShell script showing how to sum up logs with a single downstream Collector.

[`jshell/downstream-reduce-sum-up-simplified.java`](jshell/downstream-reduce-sum-up-simplified.java)

JShell script showing how to sum up logs with a specialized downstream Collector.

[`jshell/downstream-reduce-sum-up-specialized.java`](jshell/downstream-reduce-sum-up-specialized.java)

#### Flattening Collections

JShell script illustrating how to flatten Collection elements during collection.

[`jshell/downstream-flatten.java`](jshell/downstream-flatten.java)

#### Filtering Elements Collections

JShell script illustrating how to filter elements during collection.

[`jshell/downstream-filter.java`](jshell/downstream-filter.java)

#### Composite Collectors

JShell script showing how to use the `teeing` Collector.

[`jshell/downstream-teeing.java`](jshell/downstream-teeing.java)


### Creating Your Own Collectors

#### Example 7-6. Custom Collector for joining String elements

Java class showing a `String`-joining Collector.

[`java/Joinector.java`](jshell/Joinector.java)


#### Joinector with Collector.of

JShell script of using the `Collector.of` factory method to create the previous `Joinector` Collector.

[`java/joinector.java`](jshell/joinector.java)
