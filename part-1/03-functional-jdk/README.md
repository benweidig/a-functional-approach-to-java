# Chapter 3: Functional JDK

## The Big Four Functional Interface Categories

### Functions

JShell script of a `java.util.function.Function<T>`

[`jshell/function.java`](jshell/function.java)

### Consumers

JShell script of a `java.util.function.Consumer<T>`

[`jshell/consumer.java`](jshell/consumer.java)

### Suppliers

JShell script of a `java.util.function.Supplier<T>`

[`jshell/supplier.java`](jshell/supplier.java)

### Predicates

JShell script of a `java.util.function.Predicate<T>`

[`jshell/predicate.java`](jshell/predicate.java)


## Why So Many Functional Interface Variants?

### Function Arity

#### TriFunction

Java interface of a `TriFunction`.

[`java/TriFunction.java`](java/TriFunction.java)

#### Java Arity Compatibility

JShell scripts showing arity compatibility.

[`jshell/arity-compatibility.java`](jshell/arity-compatibility.java)  

#### Bridging Functional Interfaces

JShell script of how to bridge SAM-identical but type incompatible functional interfaces.

[`jshell/bridging-functional-interfaces.java`](jshell/bridging-functional-interfaces.java)


## Functional Composition

### Composition Direction

JShell script illustrating the functional composition from both directions.

[`jshell/functional-composition.java`](jshell/functional-composition.java)


##  Extending Functional Support

### Adding Default Methods

This excerpt from `java.util.Collection<E>` shows how `default` methods are used to retrofit methods without breaking backward compatibility.

```java
public interface Collection<E> extends Iterable<E> {

    default Stream<E> stream() {
        return StreamSupport.stream(spliterator(), false);
    }

    default Stream<E> parallelStream() {
        return StreamSupport.stream(spliterator(), true);
    }

  // ...
}
```

### Default Method Hierarchy

These excerpts from `java.lang.Iterable<T>`, `java.util.Collection<E>`, and `java.util.ArrayList<E>` illustrate how different types override `default` methods.

```java
public interface Iterable<T> {

    // The original definition with a common-sense implementation.
    default Spliterator<T> spliterator() {
        return Spliterators.spliteratorUnknownSize(iterator(), 0);
    }

    // ...
}


public interface Collection<E> extends Iterable<E> {

    // The Collection interface can use more information to create a more
    // specific Spliterator<E> that is available to allof its implementations.
    @Override
    default Spliterator<E> spliterator() {
        return Spliterators.spliterator(this, 0);
    }

    // ...
}


public class ArrayList<E> extends AbstractList<E> implements List<E>, ... {

    // The concrete implementation ArrayList<E>, which implements
    // Collection<E> via List<E>, provides an even further
    // specialized +Spliterator<E>.
    @Override
    public Spliterator<E> spliterator() {
        return new ArrayListSpliterator(0, -1, 0);
    }

    // ...
}
```

#### Creating Static Helpers

Java class of a simple functional compositor helper class.

[`java/Compositor.java`](java/Compositor.java)
