# Chapter 1: An Introduction to Functional Programming

This chapter mostly contains short snippets to visualize certain functional concepts and techniques.

As there are no full-fledged examples, all the code is listed here for reference.

## What Makes a Language Functional?

### Lambda Calculus and Java Representation

```math
\begin{equation}
\(f = \lambda x. E\)
\end{equation}
```

```java
Function<Integer, Integer> quadratic =
    value -> value * value;
```

### Expression Examples

```java
x * x
2 * Math.PI * radius
value == null ? true : false
```

### Statement Examples

```java
// Variable assignment
int totalTreasure = 0;

// findTreasure call is an expression,
// but variable assigment is a statement
int newTreasuresFound = findTreasure(6);

// Using an expression for reassigning a
// variable with a statement
totalTreasure = totalTreasure + newTreasuresFound;

// if-else is a statement that evaluates it's condition, which is an expression
if (totalTreasure > 10) {
    // A statement not returning any kind of result
    System.out.println("You have a lot of treasure!");
} else {
    // A statement not returning any kind of result
    System.out.println("You should look for more treasure!");
}
```


## Functional Programming Concepts

### Pure Functions and Referential Transparency

#### Example of a Pure Function

```java
public String toLowercase(String str) {
    return str;
}
```

#### Example of an Impure Function

```java
public String buildGreeting(String name) {
    var now = LocalTime.now();
    if (now.getHour() < 12) {
        return "Good morning " + name;
    } else {
        return "Hello " + name;
    }
}
```

#### Referential Transparency

```math
\begin{equation}
\begin{aligned}
\text{Abstract Function} \\
f(x) &= x * x
\\
\\
\text{Replacing Evaluated Expressions} \\
    result &= f(5) + f(5) \\
    &= 25 + f(5) \\
    &= f(5) + f(5) \\
    &= 25 + 25
\end{aligned}
\end{equation}
```


### Currying

#### Currying a function that accepts three arguments

```math
\begin{equation}
\begin{aligned}
\text{Initial function:}\\
x &= f(a,b,c)
\\[24pt]
\text{Curried functions:} \\
h &= g(a)
\\
i &= h(b)
\\
x &= i(c)
\\[24pt]
\text{Sequence of curried functions:}
\\
x &= g(a)(b)(c)
\\
\end{aligned}
\end{equation}
```

##### Haskell function definitions

```haskell
-- The function add accepts an Integer, which returns a function
-- that accepts another Integer and returns an Integer
add :: Integer -> Integer -> Integer
add x y =  x + y
```


### Partial Function Application

```haskell
add :: Integer -> Integer -> Integer
add x y =  x + y

-- Providing only one of the two arguments partially applies the function,
-- returning a new function accepting a singular argument
add3 = add 3

-- Calling add3 is equivalent to "add 3 5"
add3 5
```
