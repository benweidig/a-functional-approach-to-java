import java.util.function.UnaryOperator;

/**
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 2 - Functional Java
 *
 * Example 2-10. First-class Java Lambdas
 */

public class FirstClassCitizenship {

    public static void main(String... args) {
        // VARIABLE ASSIGNMENT

        UnaryOperator<Integer> quadraticFn = x -> x * x;

        quadraticFn.apply(5);
        // => 25

        UnaryOperator<Integer> multiplyWithFive = multiplyWith(5);

        multiplyWithFive.apply(6);
        // => 30
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
