# Chapter 11: Lazy Evaluation

## Laziness Versus Strictness

#### Example 11-1. Lazy Evaluation with Java and Suppliers

Lazy versus strict methods.  
You need to run either the methods `strict()` (which will throw an Exception) or `lazy()` manually after running the code.

[Example 11-1](example-11-1)


## How Strict is Java?

### Example 11-2. Usage of logical short-circuit operators

Valid/invalid use of logical short-circuit operators.

[Example 11-2](example-11-2)

### Lazy Types of the JDK

Illustrate how to use a `Map` lazily in a "traditional" way and with a higher-order function.

[Lazy Maps](lazy-maps)


## Lambdas and Higher-Order Functions

### Example 11-3. Updating a User with eager method arguments

Updating a `User` type eagerly.

[Example 11-3](example-11-3)

### Example 11-4. Updating a User with a lambda

Updating a `User` type with a lambda.

[Example 11-4](example-11-4)


## Delayed Executions with Thunks

### Creating a Simple Thunk

#### Example 11-5. A simple Thunk<T>

Java code of a simple `Thunk<T>` and how to use it with the previous `User` example.

[Example 11-5](example-11-5)

#### Example 11-6. Functional additions to Thunk<T>

Java code of a simple `Thunk<T>` with functional additions.

[Example 11-6](example-11-6)


### A Thread-Safe Thunk

#### Example 11-7. Thunk<T> with synchronized evaluation

Java code of a `Thunk<T>` using a `Holder<T>`.

[Example 11-7](example-11-7)
