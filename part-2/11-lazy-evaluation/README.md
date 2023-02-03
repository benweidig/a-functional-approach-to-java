# Chapter 11: Lazy Evaluation

## Laziness Versus Strictness

#### Example 11-1. Lazy Evaluation with Java and Suppliers

JShell script of lazy and strict methods.  
You need to run either the methods `strict()` (which will throw an Exception) or `lazy()` manually after running the code.

[`jshell/lazy-versus-strictness.java`](jshell/lazy-versus-strictness.java)

## How Strict is Java?

### Example 11-2. Usage of logical short-circuit operators

JShell script of valid/invalid use of logical short-circuit operators.

[`jshell/short-circuit.java`](jshell/short-circuit.java)

### Lazy Types of the JDK

JShell scripts illustrate how to use a `Map` lazily in a "traditional" way and with a higher-order function.

[`jshell/map-get.java`](jshell/map-get.java)


## Lambdas and Higher-Order Functions

### Example 11-3. Updating a User with eager method arguments

JShell script updating a `User` type eagerly.

[`jshell/update-user-eager.java`](jshell/update-user-eager.java)

### A Lazier Approach

JShell script updating a `User` type more lazily.

[`jshell/update-user-lazy.java`](jshell/update-user-lazy.java)

### Example 11-4. Updating a User with a lambda

JShell script updating a `User` type with a lambda.

[`jshell/update-user-lambda.java`](jshell/update-user-lambda.java)


## Delayed Executions with Thunks

### Creating a Simple Thunk

#### Example 11-5. A simple Thunk<T>

Java code of a simple +Thunk<T>+ and how to use it with the previous `User` example.

[`java/ThunkSimple.java`](java/ThunkSimple.java)

#### Example 11-6. Functional additions to Thunk<T>

Java code of a simple +Thunk<T>+ with functional additions.

[`java/ThunkFunctional.java`](java/ThunkFunctional.java)


### A Thread-Safe Thunk

#### Example 11-7. Thunk<T> with synchronized evaluation

Java code of a +Thunk<T>+ using a `Holder<T>`.

[`java/ThunkWithHolder.java`](java/ThunkWithHolder.java)
