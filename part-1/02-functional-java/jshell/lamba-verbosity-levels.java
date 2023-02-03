/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 2 - Functional Java
 * 
 * Example 2-1. Different ways of writing the same lambda
 */

// The most verbose variant:
// an explicitly typed parameter in parenthesis and a body block.
Predicate<String> mostVerbose = (String input) -> {
    return input != null;
};

// The first mixed variant:
// type inference for the parameter and a body block.
Predicate<String> firstMixed = input -> {
    return input != null;
};

// The second mixed variant:
// an explicitly typed parameter in parenthesis but a single expression body instead of a block.
Predicate<String> secondMixed = (String input) -> input != null;

// The most concise variant:
// type inference for the parameter and a single expression body.
Predicate<String> mostConcise = input -> input != null;
