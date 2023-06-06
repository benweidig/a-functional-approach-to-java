# Chapter 2: Functional Java

## What Are Java Lambas

### Introduction of Lambdas

```java
() -> System.out.println("Hello, lambda!")
```

#### Example 2-1. Different ways of writing the same lambda

JShell script of how to write lambdas with different verbosity levels.

```java
// The most verbose variant: an explicitly typed parameter in parentheses
// and a body block.
(String input) -> {
    return input != null;
}

// The first mixed variant: type inference for parameters allows removing the
//  explicit type, and a single parameter doesn't need parentheses.
// That shortens the lambda declaration slightly without removing information
// due to the surrounding context.
input -> {
    return input != null;
}

// The second mixed variant: an explicitly typed parameter in parentheses but
// a single expression body instead of a block; no curly braces or return
// statement needed.
(String input) -> input != null

// The most concise variant, as the body is reducible to a single expression.
input -> input != null <4>
```

#### Example 2-2. Simplified java.util.functional.Predicate<T>

The simplified and non-working version of the functional interface `java.util.function.Predicate<T>` illustrates the mix of a single-abstract method and `default` and `static` methods.

[`other/simplified-predicate-interface.java`](other/simplified-predicate-interface.java)

#### Example 2-3. Lambda variable capture

JShell script demonstrating variable capture in lambdas.

[`jshell/lambda-variable-capture.java`](jshell/lambda-variable-capture.java)

#### Example 2-4. Change data behind a final variable

Java class of reassigning a `final` variable.
The inner code of `main` won't work in JShell, as `final` variables are treated differently.

[`java/ReassignFinalVariable.java`](java/ReassignFinalVariable.java)

#### Example 2-5. Re-finalize a variable

Illustrates how to create a `final` reference to a non-`final` one.
This won't work in JShell.

[`java/RefinalizeVariable.java`](java/RefinalizeVariable.java)

#### Example 2-6. Anonymous class vs. lambda expression

JShell script implementing an interface as an anonymous class and as a lambda.

[`jshell/anonymous-vs-lambda.java`](jshell/anonymous-vs-lambda.java)

#### Example 2-7. Bytecode differences between anonymous classes and lambdas

This example requires you to compile multiple files in the `java` folder, so you can use `javap -v <class file>` to display the bytecode.

```bash
javac HelloWorld.java
javac HelloWorldAnonymous.java
javac HelloWorldLambda.java

javap -v HelloWorldAnonymous
javap -v HelloWorldLambda
```

The results of `javap` are also available in the `other` folder.

[`java/HelloWorld.java`](java/HelloWorld.java)  
[`java/HelloWorldAnonymous.java`](java/HelloWorldAnonymous.java)  
[`java/HelloWorldLambda.java`](java/HelloWorldLambda.java)  

[`other/HelloWorldAnonymous.bytecode`](other/HelloWorldAnonymous.bytecode)  
[`other/HelloWorldLambda.bytecode`](other/HelloWorldLambda.bytecode)


## Lambdas in Action

### Creating Lambdas

#### Incompatible equivalent Functional Interfaces

JShell script showing equivalent functional interfaces that aren't interchangeable.

[`jshell/incompatible-functional-interfaces.java`](jshell/incompatible-functional-interfaces.java)

#### Ad-hoc created lambdas

JShell script showing that ad-hoc created lambdas infer their type.

[`jshell/ad-hoc-created-lambdas-type-inference.java]


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

JShell script highlighting the difference between using lambdas and method references in a Stream pipeline.

[`jshell/method-references-and-streams.java`](jshell/method-references-and-streams.java)

#### Static Method References

JShell script of how to use static method references.

[`jshell/method-references-static.java`](jshell/method-references-static.java)

#### Bound non-static Method References

JShell scripts of how to use bound non-static method references.

[`jshell/method-references-bound-non-static.java`](jshell/method-references-bound-non-static.java)  
[`jshell/method-references-bound-non-static-no-intermediate.java`](jshell/method-references-bound-non-static-no-intermediate.java)  
[`jshell/method-references-bound-non-static-this-super.java`](jshell/method-references-bound-non-static-this-super.java)

#### Unbound non-static Method References

JShell script of how to use unbound non-static method references.

[`jshell/method-references-unbound-non-static.java`](jshell/method-references-unbound-non-static.java)

#### Constructor References

JShell script of how to use constructor references.

[`jshell/method-references-constructor.java`](jshell/method-references-constructor.java)


## Functional Programming Concepts in Java

### Pure Functions and Referential Transparency

#### Example 2-9. Memoization with Map#computeIfAbsent

JShell script illustrating a memoized call.

[`jshell/memoization.java`](jshell/memoization.java)


### First-Class and Higher-Order

#### Example 2-10. First-class Java Lambdas

JShell script showing different use cases for first-class lambdas.

[`jshell/first-class.java`](jshell/first-class.java)
