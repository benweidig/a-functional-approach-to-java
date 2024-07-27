//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 2 - Functional Java
//
// Example 2-10. First-class Java Lambdas
//

import java.util.function.UnaryOperator;

public class FirstClassCitizenship {

    public static void main(String... args) {
        // VARIABLE ASSIGNMENT

        UnaryOperator<Integer> quadraticFn = x -> x * x;

        var quadratic = quadraticFn.apply(5);
        System.out.println("quadratic = " + quadratic);

        UnaryOperator<Integer> multiplyWithFive = multiplyWith(5);

        var result = multiplyWithFive.apply(6);
        System.out.println("multiplyWithFive = " + result);
    }

    // METHOD ARGUMENT

    public static Integer apply(Integer input, UnaryOperator<Integer> operation) {

        return operation.apply(input);
    }

    // RETURN VALUE

    public static UnaryOperator<Integer> multiplyWith(Integer multiplier) {

        return x -> multiplier * x;
    }
}
