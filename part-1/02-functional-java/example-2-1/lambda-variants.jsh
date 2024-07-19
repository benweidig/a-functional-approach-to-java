//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 2 - Functional Java
//
// Example 2-1. Different ways of writing the same lambda
//

// MOST VERBOSE OPTION
// - Typed parameters
// - Block body
Predicate<String> verbose = (String input) -> {
    return input != null;
}

// MIXED VARIANT 1
// - Type infered parameters
// - Block body
Predicate<String> mixed1 = input -> {
    return input != null;
}

// MIXED VARIANT 2
// - Typed parameters
// - Single expression body
Predicate<String> mixed2 = (String input) -> input != null

// SHORTEST VARIANT
// - Type infered parameters (without parentheses)
// - Single expression body
Predicate<String> shortest = input -> input != null
