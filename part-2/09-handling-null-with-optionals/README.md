# Chapter 9: Handling null with Options

## The Problem with null References

### Example 9-1. A minefield of possible nulls

JShell script of way too many possible `null` references.

[`jshell/minefield.java`](jshell/minefield.java)

### Example 9-2. null type ambiguity

JShell script demonstrating the type ambiguity of `null`.

[`jshell/null-type-ambiguity.java`](jshell/null-type-ambiguity.java)


## How to handle null in Java (before Optionals)

### Do's and Dont's

JShell script with best practices on how to handle `null`.  
This script is for illustration purposes and won't run.

[`jshell/dos-and-donts.java`](jshell/dos-and-donts.java)


## Optionals to the Rescue

### What's an Optional?

#### Example 9-4. Loading content without Optionals

JShell script of loading and caching content without Optionals.

[`jshell/loading-content-without-optionals.java`](jshell/loading-content-without-optionals.java)

#### Example 9-5. Loading content with an Optional call chain

[`jshell/loading-content-with-optional-call-chain.java`](jshell/loading-content-with-optional-call-chain.java)


### Building Optional Pipelines

#### Creating an Optional

JShell scripts demonstrating the different `Optional<T>` creation methods.

[`jshell/create-optional.java`](jshell/create-optional.java)  
[`jshell/create-optional-exception.java`](jshell/create-optional-exception.java)  
[`jshell/create-optional-empty.java`](jshell/create-optional-empty.java)

#### Example 9-6. Checking for Optional values

JShell script of how to check an Optional for its inner value.

[`jshell/check-optional.java`](jshell/check-optional.java)


#### Example 9-7. Intermediate operations to find an active admin

JShell script of how to use intermediate Optional operations.

[`jshell/filter-map-optional.java`](jshell/filter-map-optional.java)

#### Example 9-8. Finding an active admin without Optionals

JShell script of the previous example without Optionals.

[`jshell/filter-map-without-optionals.java`](jshell/filter-map-without-optionals.java)


## Optionals and Streams

### Optionals as Stream Elements

#### Example 9-9. Optionals as Stream elements

JShell script of a Stream pipeline with Optionals.

[`jshell/stream-filter-map.java`](jshell/stream-filter-map.java)

#### Example 9-10. Optionals as Stream elements with flatMap

JShell script of the previous Stream pipeline using the `flatMap` operation.

[`jshell/stream-flatmap.java`](jshell/stream-flatmap.java)


##### Example 9-11. Pseudo-code equivalent to the reduce operation

JShell script of the previous Stream pipeline using the `flatMap` operation.  
This is for illustration purposes only.

[`jshell/pseudo-reduce.java`](jshell/pseudo-reduce.java)

## Caveats

### Example 9-12. Using Optionals in Serializable types

JShell script showing how to design serializable types using Optionals.

[`jshell/serialization.java`](jshell/serialization.java)


