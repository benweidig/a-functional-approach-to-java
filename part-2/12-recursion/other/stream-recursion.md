# Chapter 12: Recursion

## Streams and Recursion

An alternative approach to recursion is using an infinite Stream pipeline with the recursive call wrapped in a functional interface.
Such an interface has to represent all parts of a recursive algorithm:

```java
@FunctionalInterface
public interface RecursiveCall<T> {

    // Represents the recursive call
    RecursiveCall<T> apply();

    // The wrapper needs to know when the call chain is
    // complete by reaching its base condition
    default boolean isComplete() {
        return false;
    }

    // The final result of the recursive call
    default T result() {
        return null;
    }

    // Starts the Stream pipeline
    default T run() {
        return Stream.iterate(this, RecursiveCall::apply)
                     .filter(RecursiveCall::isComplete)
                     .findFirst()
                     .get()
                     .result();
    }

    // A convenience method for creating a lambda representing
    // a reached base condition and containing the actual result
    static <T> RecursiveCall<T> done(T value) { <5>

        return new RecursiveCall<T>() {

            @Override
            public boolean isComplete() {
                return true;
            }

            @Override
            public T result() {
                return value;
            }

            @Override
            public RecursiveCall<T> apply() {
                return this;
            }
        };
    }
}
```

Calling `run()` will create and run an infinite Stream pipeline.
The `Stream.iterate(...)` method applies the initial value (`this`) to the `UnaryOperator` (`this::apply`).

The result is then iteratively applied again to the `UnaryOperator` until `isComplete() == true`, and the Stream's terminal operation `findFirst()` is reached.

This functional interface is an iterative wrapper for recursive-style calls, eliminating a `StackOverflowError`, or in the case of calculating factorials, a number overflow.

As the example of calculating a factorial results in a number overflow quite quickly – the biggest possible +long+ is 9,223,372,036,854,775,807, or 2^63-1, which lies between 20! and 21! – a simpler example is chosen: summing up numbers.

The following code represents a recursive call, but as a `RecursiveCall<Long>`:

```java
RecursiveCall<Long> sum(Long total, Long summand) {
    if (summand == 1) {
        return RecursiveCall.done(total);
    }

    return () -> sum(total + summand, summand - 1L);
}

var result = sum(1L, 4000L).run();
```

Compared to an actual recursive version, the only difference is that the base condition and the return value of `sum(...)` are wrapped in a new `RecursiveCall` lambda.

The invisible difference between recursion and "recursion-like" with Streams is the stack depth.
As the recursive version creates a new stack frame for every method invocation, the Stream works iteratively, and therefore has a consistent stack depth.
It might differ if its implementation changes.
Still, it will always be consistent, regardless of the required recursive steps.
That allows you to use a recursive approach to solving a problem requiring a lot of nested calls which usually would throw a `StackOverflowError`.

A Stream-based approach to recursion is a great proof-of-concept to highlight the functional capabilities of Java and Streams.
However, I wouldn't recommend it as a general-purpose "real-world" solution.
A simple loop, or even a Stream pipeline without a specialized `RecursiveCall` type is often sufficient and will make your code more concise and reasonable.
