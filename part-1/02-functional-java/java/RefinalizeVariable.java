/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 2 - Functional Java
 * 
 * Example 2-5. Re-finalize a variable
 */
import java.util.function.Predicate;

public class RefinalizeVariable {

    public static void main(String... args) {

        var nonEffectivelyFinal = 1_000L;
        nonEffectivelyFinal = 9_000L;

        var finalAgain = nonEffectivelyFinal;

        Predicate<Long> isOver9000 = input -> input > finalAgain;
    }
}
