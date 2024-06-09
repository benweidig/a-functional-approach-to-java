import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 3 - Functional JDK
 *
 * Example 3-1. Java arity compatibility
 */
public class ArityCompatibility {

    public static void main(String[] args) {
        UnaryOperator<String> unaryOp = String::toUpperCase;

        Function<String, String> func = String::toUpperCase;

        // THESE TWO CALLS ARE OK
        acceptsUnary(unaryOp);
        acceptsFunction(func);
        acceptsFunction(unaryOp);

        // THIS CALL WON'T COMPILE
        acceptsUnary(func);

        /*
         * COMPILER ERROR:
         * The method acceptsUnary(UnaryOperator<String>) in the type ArityCompatibility is
         * not applicable for the arguments (Function<String,String>)
         */
    }

    private static void acceptsUnary(UnaryOperator<String> unaryOp) {
        // ...
    }

    private static void acceptsFunction(Function<String, String> func) {
        // ...
    }
}
