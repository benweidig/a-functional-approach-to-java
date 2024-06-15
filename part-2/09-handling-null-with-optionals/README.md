# Chapter 9: Handling null with Options

## The Problem with null References

### Example 9-1. A minefield of possible nulls

Way too many possible `null` references.

[Example 9-1](example-9-1)

### Example 9-2. null type ambiguity

Demonstrating the type ambiguity of `null`.

[Example 9-2](example-9-2)


## How to handle null in Java (before Optionals)

### Do's and Don'ts

Best practices on how to handle `null`.  
This is for illustration purposes and won't run.

[`Do's and Don'ts`](dos-and-donts)


## Optionals to the Rescue

### What's an Optional?

#### Example 9-4. Loading content without Optionals

Loading and caching content without Optionals.

[Example 9-4](example-9-4)

#### Example 9-5. Loading content with an Optional call chain

Previous example but with an Optional call chain.

[Example 9-5](example-9-5)


### Building Optional Pipelines

#### Example 9-6. Checking for Optional values

How to check an Optional for its inner value.

[Example 9-6](example-9-6)

#### Example 9-7. Intermediate operations to find an active admin

How to use intermediate Optional operations.

[Example 9-7](example-9-7)

#### Example 9-8. Finding an active admin without Optionals

Previous example without Optionals.

[Example 9-8](example-9-8)


## Optionals and Streams

### Optionals as Stream Elements

#### Example 9-9. Optionals as Stream elements

Stream pipeline with Optionals.

[Example 9-9](example-9-9)

#### Example 9-10. Optionals as Stream elements with flatMap

Previous Stream pipeline using the `flatMap` operation.

[Example 9-10](example-9-10)

##### Example 9-11. Pseudo-code equivalent to the reduce operation

Previous Stream pipeline using the `flatMap` operation.  
This is for illustration purposes only.

[Example 9-11](example-9-11)


## Caveats

### Example 9-12. Using Optionals in Serializable types

How to design serializable types using Optionals.

[Example 9-12](example-9-12)
