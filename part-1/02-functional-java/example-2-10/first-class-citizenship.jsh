//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 2 - Functional Java
//
// Example 2-10. First-class Java Lambdas
//

import java.util.function.UnaryOperator

// VARIABLE ASSIGNMENT

UnaryOperator<Integer> quadraticFn = x -> x * x
var quadratic = quadraticFn.apply(5)
System.out.println("quadratic = " + quadratic)


// METHOD ARGUMENT

Integer apply(Integer input, UnaryOperator<Integer> operation) {
    return operation.apply(input);
}


// RETURN VALUE

UnaryOperator<Integer> multiplyWith(Integer multiplier) {
    return x -> multiplier * x;
}

UnaryOperator<Integer> multiplyWithFive = multiplyWith(5)
var result = multiplyWithFive.apply(6)
System.out.println("multiplyWithFive = " + multiplyWithFive)
