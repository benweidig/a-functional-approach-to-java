# Chapter 3: Functional JDK

## The Big Four Functional Interface Categories

### Functions

Examples for `java.util.function.Function<T, R>`

[Figure 3-1](figure-3-1)

### Consumers

Examples for `java.util.function.Consumer<T>`

[Figure 3-2](figure-3-2)

### Suppliers

Examples for `java.util.function.Supplier<T>`

[Figure 3-3](figure-3-3)

### Predicates

Examples for `java.util.function.Predicate<T>`

[Figure 3-4](figure-3-4)


## Why So Many Functional Interface Variants?

### Function Arity

#### Java Arity Compatibility

Code showing arity compatibility.

[Example 3-1](example-3-1)

#### Bridging Functional Interfaces

Example of how to bridge SAM-identical but type incompatible functional interfaces.

[bridging-functional-interfaces](bridging-functional-interfaces)


## Functional Composition

### Composition Direction

Example illustrating the functional composition from both directions.

[Example 3-2](example-3-2)


## Extending Functional Support

### Default Method Hierarchy

These are excerpts from `java.lang.Iterable<T>`, `java.util.Collection<E>`, and `java.util.ArrayList<E>`, to illustrate how different types override `default` methods.

[Example 3-3](example-3-3)


#### Creating Static Helpers

Creating a compose method.

[Example 3-4](example-3-4)


Java classes of a simple functional compositor helper class and how to use it

[Example 3-5](example-3-5)

[Example 3-6](example-3-6)
