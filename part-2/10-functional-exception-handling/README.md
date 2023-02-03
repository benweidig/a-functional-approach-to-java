# Chapter 10: Functional Exception Handling

## The try-catch

JShell script of multiple `try-catch` blocks.

[`jshell/try-catch.java`](jshell/try-catch.java)


## Checked Exceptions in Lambdas

JShell script illustrating the problem of checked Exceptions in lambdas.

[`jshell/files-readstring.java`](jshell/files-readstring.java)

<br />

Modified JShell script of the previous script with an unwieldy `try-catch` block in the Stream pipeline.

[`jshell/files-readstring-try-catch.java`](jshell/files-readstring-try-catch.java)

### Safe Method Extraction

#### Example 10-1. Extract throwing code into a safe method

JShell script showing how to extract throwing code into a "safe" method.

[`jshell/safe-method-extraction.java`](jshell/safe-method-extraction.java)


### Un-Checking Exceptions

#### Example 10-2. Unchecking java.util.Function & Example 10-3. Using ThrowingFunction<T,U>

Java interface of a custom `java.util.Function` variant and how to use it.

[`java/ThrowingFunction.java`](java/ThrowingFunction.java)


### Sneaky Throws

Java example of how to sneakily throw an Exception circumventing the _catch-or-specify_ requirement.

[`java/SneakyThrows.java`](java/SneakyThrows.java)


## A Functional Approach to Exceptions

### Not Throwing Exceptions

#### Example 10-4. Using Optional<String> instead of throwing an IOException

JShell script showing how to design a method to use Optionals to mitigate Exception handling.

[`jshell/not-throwing-exceptions.java`](jshell/not-throwing-exceptions.java)

### Errors as Values

Go code of how to return a tuple including the error itself.

[`other/errors-as-values.java`](other/errors-as-values)

#### Creating a Result Type

JShell scripts and Java classes of the stages during the creation of a Result type.

##### Example 10-5. Traditional Result Object

[`jshell/result-scaffold.java`](jshell/result-scaffold.java)

##### Example 10-6. Using Result<V, E> as a return type

[`java/ResultAsReturnType.java`](java/ResultAsReturnType.java)

##### Example 10-7. Adding Transformers to Result<V, E>

[`java/ResultTransformers.java`](java/ResultTransformers.java)

##### React to certain states

[`java/ResultReactions.java`](java/ResultReactions.java)

##### Fallback values

[`java/ResultFallbackValues.java`](java/ResultFallbackValues.java)


### The Try/Success/Failure pattern

JShell scripts, Java classes and other code of developing a +Try<T, R>+ type.

#### Example 10-8. Scala’s Try/Success/Failure pattern

Scala code illustrating the _try/success/failure_ pattern.

#### Example 10-9. Minimal Try<T, R> accepting a lambda and Exception handler

[`java/TryMinimal.java`](java/TryMinimal.java)

#### Example 10-10. Handling success and failure in Try<T, R>

[`java/TryHandling.java`](java/TryHandling.java)

#### Example 10-11. Applying a value to Try

[`java/TryApply.java`](java/TryApply.java)

#### Example 10-12. Implementing Function<T, Optional<R>>

[`java/TryFunction.java`](java/TryFunction.java)
