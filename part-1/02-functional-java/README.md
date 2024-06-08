# Chapter 2: Functional Java

## What Are Java Lambas

### Introduction of Lambdas

```java
() -> System.out.println("Hello, lambda!")
```

#### Example 2-1. Different ways of writing the same lambda

How to write lambdas at different levels of verbosity.

[Example 2-1](example-2-1)


#### Example 2-2. Simplified java.util.functional.Predicate&lt;T&gt;

The simplified and _non-working_ version of the functional interface `java.util.function.Predicate<T>` illustrates the mix of a single-abstract method and `default` and `static` methods.

[Example 2-2](example-2-2)


#### Example 2-3. Lambda variable capture

Example demonstrating variable capture in lambdas.

[Example 2-3](example-2-3)


#### Example 2-4. Change data behind a final variable

Java class of reassigning a `final` variable.
The inner code of `main` won't work in JShell, as `final` variables are treated differently.

[Example 2-4](example-2-4)


#### Example 2-5. Re-finalize a variable

Illustrates how to create a `final` reference to a non-`final` one.
This also won't work in JShell.

[Example 2-5](example-2-5)


#### Example 2-6. Anonymous class vs. lambda expression

The differences between implementing an interface as an anonymous class or as a lambda.

[Example 2-6](example-2-6)


#### Example 2-7. Bytecode differences between anonymous classes and lambdas

This example requires you to compile multiple files from the previous example, so you can use `javap -v <class file>` to display the bytecode.

```bash
javac HelloWorld.java
javac HelloWorldAnonymous.java
javac HelloWorldLambda.java

javap -v HelloWorldAnonymous
javap -v HelloWorldLambda
```

[Example 2-7](example-2-7)


## Lambdas in Action

### Creating Lambdas

#### Incompatible equivalent Functional Interfaces

JShell script showing equivalent functional interfaces that aren't interchangeable.

[`jshell/incompatible-functional-interfaces.jshell`](jshell/incompatible-functional-interfaces.jshell)


#### Ad-hoc created lambdas

JShell script showing that ad-hoc created lambdas infer their type.

[`jshell/ad-hoc-created-lambdas-type-inference.jshell`](jshell/ad-hoc-created-lambdas-type-inference.jshell)


### Calling Lambdas

#### JavaScript Versus Java Lambdas

How to call lambdas, comparing JavaScript and Java.

```javascript
let helloWorldJs = name => "hello, " + name + "!"

let resultJs = helloWorldJs("Ben")
```

```java
Function<String, String> helloWorld = name -> "hello, " + name + "!";

var result = helloWorld.apply("Ben");
```


### Method References

#### Example 2-8. Method References and Streams

Example highlighting the difference between using lambdas and method references in a Stream pipeline.

[Example 2.8](example-2-8)


#### Different Types of Method References

Multiple example files showing the syntax for method references

[Method References](method-references)



## Functional Programming Concepts in Java

### Pure Functions and Referential Transparency

#### Example 2-9. Memoization with Map#computeIfAbsent

Program illustrating how to memoize a call.

[Example 2-9](example-2-9)


### First-Class and Higher-Order

#### Example 2-10. First-class Java Lambdas

Example showing different use cases for first-class lambdas.

[Example 2-10](example-2-10)
