# Chapter 7: Working With Streams

## Iterative Streams

Comparing iterative approaches.

* `for`-loop
* `Stream.iterate`
* `IntStream.iterate` (Java 8 &amp; 9+)

[Stream iteration](stream-iteration)


## Infinite Streams

Illustrating a generated parallel unordered Stream overshooting its limit.

[Infinite Stream](stream-infinite)


## From Arrays to Streams and Back

Working with Object and Primitive Streams and Array.

[toArray Terminal Op](stream-toarray)


## Working with File I/O

### Reading Directory Contents

#### Example 7-1. Listing folders in a directory

How to list contents of a directory.

[Example 7-1](example-7-1)

### Depth-First Directory Traversal

#### Example 7-2. Walking the Filesystem

Walking a directory.

[Example 7-2](example-7-2)

### Searching the Filesystem

#### Example 7-3. Finding Folders

[Example 7-3](example-7-3)

### Reading Files Line-By-Line

#### Example 7-4. Counting words in “War and Peace”

How to read a file line-by-line into a Stream.

[Example 7-4](example-7-4)


## Dealing with Date and Time

#### Querying Temporal Types

How to query Java Time API types.

[Temporal Queries](temporal-query)


## More about Collectors

### Downstream Collectors

A collection of examples for Downstream collectors.

[Downstream Collectors](downstream-collectors)

### Example 7-5. Counting logins

How to use 2 Downstream Collectors by teeing.

[Example 7-5](example-7-5)

### Creating Your Own Collectors

#### Example 7-6. Custom Collector for joining String elements

How to create a `String`-joining Collector.

[Example 7.6](example-7-6)
