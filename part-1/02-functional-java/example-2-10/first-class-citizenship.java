import java.util.function.UnaryOperator;

//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 2 - Functional Java
//
// Example 2-10. First-class Java Lambdas
//

// VARIABLE ASSIGNMENT

UnaryOperator<Integer> quadraticFn = x -> x * x;
quadraticFn.apply(5);
// => 25


// METHOD ARGUMENT

Integer apply(Integer input, UnaryOperator<Integer> operation) {
    return operation.apply(input);
}


// RETURN VALUE

UnaryOperator<Integer> multiplyWith(Integer multiplier) {
    return x -> multiplier * x;
}
UnaryOperator<Integer> multiplyWithFive = multiplyWith(5);
multiplyWithFive.apply(6);
// => 30
