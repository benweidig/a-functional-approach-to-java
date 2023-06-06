# Chapter 6: Data Processing With Streams

## Data Processing with Iteration

### Example 6-1. Finding books with a for-loop

JShell script illustrating external iteration with a `for`-loop.

[`jshell/finding-books-for-loop.java`](jshell/finding-books-for-loop.java)


## Streams as Functional Data Pipelines

### Example 6-2. Finding books with a Stream

JShell script illustrating internal iteration with a Stream.

[`jshell/finding-books-stream.java`](jshell/finding-books-stream.java)

### Spliterator, the Backbone of Streams

#### Example 6-3. Spliterator characteristics of `HashSet<T>`

Excerpt from `java.util.HashSet` highlighting its Spliterator characteristics.

[`other/HashSet.java`](other/HashSet.java)


## Building Stream Pipelines

### Creating a Stream

#### Example 6-4. Simplified Stream creation for Collection types

Excerpt from `java.util.Collection` showing the retrofitted Stream-related methods.

[`other/Collection.java`](other/Collection.java)


### Doing the Work

#### Example 6-5. A simple Shape type

A simple Shape Record reused in the upcoming examples.

[`jshell/shape.java`](jshell/shape.java)

#### Example 6-6. Shape flatMap versus mapMulti

JShell script showing the difference between the `flatMap` and `mapMulti` operation.

[`jshell/flat-map-map-multi.java`](jshell/flat-map-map-multi.java)

#### Example 6-7. Peeking into a Stream

JShell script that peeks into a Stream.

[`jshell/peek.java`](jshell/peek.java)


### Terminating the Stream

#### Example 6-8. Finding the max number of a collection

JShell script illustrating how to find the maximum number in a Collection.

[`jshell/max-in-collection.java`](jshell/max-in-collection.java)

#### Example 6-9. Reduce-like for-loop

JShell script of a generic reduce-like `for`-loop and the implementation of the previous `max` method with it.

[`jshell/reduce-like-for-loop.java`](jshell/reduce-like-for-loop.java)

#### Example 6-10. Three-arguments reduce() versus map + two-arguments reduce

JShell script showing the difference between the `reduce` operation and `map + reduce`.

[`jshell/reduce-vs-map-reduce.java`](jshell/reduce-vs-map-reduce.java)

#### Example 6-11. Aggregate elements with the reduce operation

JShell script using the `reduce` operation to aggregate Stream elements.

[`jshell/reduce-aggregate.java`](jshell/reduce-aggregate.java)

#### Example 6-12. Immutable accumulation of numbers with a Stream

JShell script using the `reduce` operation for immutable accumulation of numbers.

[`jshell/reduce-immutable-aggregation.java`](jshell/reduce-immutable-aggregation.java)


#### Example 6-13. Concatenating String elements with reduce and collect

JShell script illustrating the difference between the `reduce` and `collect` operations for concatenating String elements.

[`jshell/reduce-vs-collect.java`](jshell/reduce-vs-collect.java)


### The Cost of Operations

#### Example 6-14. Fruit pipeline (naïve)

Naïve JShell script for processing fruits.

[`jshell/fruits-naive.java`](jshell/fruits-naive.java)

#### Example 6-15. Fruit pipeline (improved)

Cost-optimized Stream pipeline to process fruits.

[`jshell/fruits-improved.java`](jshell/fruits-improved.java)

#### Short-Circuiting Operations

JShell scripts of how operations might get dropped if they aren't relevant to the result.

[`jshell/short-circuiting-dropped.java`](jshell/short-circuiting-dropped.java)  
[`jshell/short-circuiting-not-dropped.java`](jshell/short-circuiting-not-dropped.java)

