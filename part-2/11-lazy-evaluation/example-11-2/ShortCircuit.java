//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 11 - Lazy Evaluation
//
// Example 11-2. Usage of logical short-circuit operators
//

public class ShortCircuit {

    static boolean left() {
        return true;
    }

    static boolean right() {
        return true;
    }

    public static void main(String[] args) {

        // WON'T COMPILE: unused result
        // left() || right();

        // COMPILES: used as if condition

        if (left() || right()) {
            // ...
        }

        // COMPILES: used as variable assignment

        var result = left() || right();
        System.out.println("result: " + result);
    }
}
