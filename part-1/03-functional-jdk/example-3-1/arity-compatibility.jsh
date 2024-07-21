//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 3 - Functional JDK
//
// Example 3-1. Java arity compatibility
//

UnaryOperator<String> unaryOp = String::toUpperCase;

Function<String, String> func = String::toUpperCase;


void acceptsUnary(UnaryOperator<String> unaryOp) {
    // ...
}

void acceptsFunction(Function<String, String> func) {
    // ...
}

// THESE TWO CALLS ARE OK
acceptsUnary(unaryOp)
acceptsFunction(func)
acceptsFunction(unaryOp)

// THIS CALL WON'T COMPILE
acceptsUnary(func)

//
// COMPILER ERROR:
// incompatible types: java.util.function.Function<java.lang.String,java.lang.String> cannot be converted to java.util.function.UnaryOperator<java.lang.String>
// acceptsUnary(func);
//
