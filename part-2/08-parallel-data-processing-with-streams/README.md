# Chapter 8: Parallel Data Processing with Streams

## Parallel Streams in Action

### Example 8-1. Sequentially counting words in "War and Peace"

JShell script illustrating a naïve approach to counting words sequentially.

[`jshell/war-and-peace-sequential.java`](jshell/war-and-peace-sequential.java)

### Example 8-1. Sequentially counting words in "War and Peace"

JShell script showing how to improve the previous example with a parallel Stream.

[`jshell/war-and-peace-parallel.java`](jshell/war-and-peace-parallel.java)


## When to Use and When to Avoid Parallel Streams

### Stream Operations

#### Example 8-3. Mutable accumulation with a for-loop

JShell script of a simple for-loop summing up numbers.

[`jshell/mutable-accumulation.java`](jshell/mutable-accumulation.java)

#### Example 8-4. Immutable accumulation of numbers with a Stream

JShell script of the previous example with a Stream and a `reduce` operation.

[`jshell/immutable-accumulation.java`](jshell/immutable-accumulation.java)

#### Example 8-5. Random number statistics

JShell scripts for generating `IntSummaryStatistics`` from different data sources.

[`jshell/random-number-stats-for-loop.java`](jshell/random-number-stats-for-loop.java)  
[`jshell/random-number-stats-instream-sequential.java`](jshell/random-number-stats-instream-sequential.java)  
[`jshell/random-number-stats-instream-parallel.java`](jshell/random-number-stats-instream-parallel.java)
