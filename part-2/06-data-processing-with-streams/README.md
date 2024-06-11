# Chapter 6: Data Processing With Streams

## Data Processing with Iteration

### Example 6-1. Finding books with a for-loop

Processing a `List<Book>` in a `for`-loop.

[Example 6-1](example-6-1)


## Streams as Functional Data Pipelines

### Example 6-2. Finding books with a Stream


Illustrating internal iteration with a Stream to find books.

[Example 6-2](example-6-2)

### Spliterator, the Backbone of Streams

#### Example 6-3. The java.util.Spliterator interface

Simplified variant of the `java.util.Spliterator<T>` interface.

[Example 6-3](example-6-3)

#### Example 6-4. Spliterator characteristics of `HashSet<T>`

Excerpt from `java.util.HashSet` highlighting its Spliterator characteristics.

[Example 6-4](example-6-4)


## Building Stream Pipelines

### Creating a Stream

#### Example 6-5. Simplified Stream creation for Collection types

Excerpt from `java.util.Collection` showing the retrofitted Stream-related methods.

[Example 6-5](example-6-5)


### Doing the Work

#### Example 6-6. A simple Shape type

A simple Shape Record reused in the upcoming examples.

[Example 6-6](example-6-6)


#### Example 6-7. Shape flatMap versus mapMulti

The difference between the `flatMap` and `mapMulti` operation.

[Example 6-7](example-6-7)

#### Example 6-8. Peeking into a Stream

Peeking into a Stream.

[Example 6-8](example-6-8)


### Terminating the Stream

#### Example 6-9. Finding the max number of a collection

Illustrating how to find the maximum number in a Collection.

[Example 6-9](example-6-9)

#### Example 6-10. Reduce-like for-loop

Generic reduce-like `for`-loop and the implementation of the previous `max` method with it.

[Example 6-10](example-6-10)

#### Example 6-11. Three-arguments reduce() versus map + two-arguments reduce

Showing the difference between the `reduce` operation and `map + reduce`.

[Example 6-11](example-6-11)

#### Example 6-12. Aggregate elements with the reduce operation

Using the `reduce` operation to aggregate Stream elements.

[Example 6-12](example-6-12)

#### Example 6-13. Immutable accumulation of numbers with a Stream

Using the `reduce` operation for immutable accumulation of numbers.

[Example 6-13](example-6-13)

#### Example 6-14. Concatenating String elements with reduce and collect

Illustrating the difference between the `reduce` and `collect` operations for concatenating String elements.

[Example 6-14](example-6-14)


### The Cost of Operations

#### Example 6-15. Fruit pipeline (naïve)

Naïve fruit processing.

[Example 6-15](example-6-15)

#### Example 6-16. Fruit pipeline (improved)

Cost-optimized Stream pipeline to process fruits.

[Example 6-16](example-6-16)

#### Short-Circuiting Operations

How operations might get dropped if they aren't relevant to the result.

[Short-Circuiting Operations](short-circuiting)
