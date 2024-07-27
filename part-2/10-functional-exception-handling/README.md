# Chapter 10: Functional Exception Handling

## The try-catch

Examples of `try-catch` blocks.

[`try-catch` blocks](try-catch)


## Checked Exceptions in Lambdas

Illustrating the problem of checked Exceptions in lambdas.

[`files-read-string`]](files-read-string)


### Safe Method Extraction

#### Example 10-1. Extract throwing code into a safe method

How to extract throwing code into a "safe" method.

[Example 10-1](example-10-1)


### Un-Checking Exceptions

#### Example 10-2. Unchecking java.util.Function & Example 10-3. Using ThrowingFunction<T,U>

Java interface of a custom `java.util.Function` variant and how to use it.

[Example 10-2](example-10-2)  


### Sneaky Throws

Example of how to sneakily throw an Exception circumventing the _catch-or-specify_ requirement.

[Sneaky Throws](sneaky-throws)


## A Functional Approach to Exceptions

### Not Throwing Exceptions

#### Example 10-4. Using Optional<String> instead of throwing an IOException

How to design a method to use Optionals to mitigate Exception handling.

[Example 10-4](example-10-4)

### Errors as Values

Go code of how to return a tuple including the error itself.

[Errors as Values (Golang)](errors-as-values)

#### Creating a Result Type

The stages during the creation of a Result type.

##### Example 10-5. Traditional Result Object

[Example 10-5](example-10-5)

##### Example 10-6. Using Result<V, E> as a return type

[Example 10-6](example-10-6)

##### Example 10-7. Adding Transformers to Result<V, E>

[Example 10-7](example-10-7)

##### React to certain states and Fallback values

[Result Reactions and Fallback Values](result-reactions-fallback)


### The Try/Success/Failure pattern

JShell scripts, Java classes and other code of developing a +Try<T, R>+ type.

#### Example 10-8. Scala’s Try/Success/Failure pattern

Scala code illustrating the _try/success/failure_ pattern.

[Example 10-8](example-10-8)

#### Example 10-9. Minimal Try<T, R> accepting a lambda and Exception handler

[Example 10-9](example-10-9)

#### Example 10-10. Handling success and failure in Try<T, R>

[Example 10-10](example-10-10)

#### Example 10-11. Applying a value to Try

[Example 10-11](example-10-11)

#### Example 10-12. Implementing Function<T, Optional&lt;R>>

[Example 10-12](example-10-12)
