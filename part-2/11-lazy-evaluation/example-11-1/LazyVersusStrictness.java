//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 11 - Lazy Evaluation
//
// Example 11-1. Lazy Evaluation with Java and Suppliers
//

import java.util.function.IntSupplier;

public class LazyVersusStrictness {

    static int strict(int x, int y) {
        return x + x;
    }

    static int lazy(IntSupplier x, IntSupplier y) {
        return x.getAsInt() + x.getAsInt();
    }
    public static void main(String... args) {


        // THE ARGUMENTS ARE LAMBDAS AND ONLYS EVALUATED IF EVALUATED THEMSELVES

        var lazyResult = lazy(() -> 5, () -> 1 / 0);
        System.out.println("lazy: " + lazyResult);

        // ALL ARGUMENTS ARE EVALUATED DURING THE CALL, WHICH WILL THROW
        // AN ArithmeticException

        var strictResult = strict(5, 1 / 0);
        System.out.println("strict: " + strictResult);
    }
}
