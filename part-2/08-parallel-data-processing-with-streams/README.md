# Chapter 8: Parallel Data Processing with Streams

## Parallel Streams in Action

### Example 8-1. Sequentially counting words in "War and Peace"

Illustrating a naïve approach to counting words sequentially.

[Example 8-1](example-8-1)

### Example 8-2. Parallel counting words in "War and Peace"

Showing how to improve the previous example with a parallel Stream.

[Example 8-2](example-8-2)


## When to Use and When to Avoid Parallel Streams

### Stream Operations

#### Example 8-3. Mutable accumulation with a for-loop

Simple for-loop summing up numbers.

[Example 8-3](example-8-3)

#### Example 8-4. Immutable accumulation of numbers with a Stream

Previous example with a Stream and a `reduce` operation.

[Example 8-4](example-8-4)

#### Example 8-5. Random number statistics

Generating `IntSummaryStatistics` from different data sources.

[Example 8-5](example-8-5)
