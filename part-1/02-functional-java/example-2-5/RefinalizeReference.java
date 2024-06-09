import java.util.function.Predicate;

/**
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 2 - Functional Java
 * 
 * Example 2-5. Re-finalize a variable

 * THERE'S NO JSHELL VARIANT AS THE KEYWORD FINAL DOESN'T
 * WORK AS EXPECTED IN THE REPL
 */
public class RefinalizeReference {

    public static void main(String... args) {

        var nonEffectivelyFinal = 1_000L;
        nonEffectivelyFinal = 9_000L;

        var finalAgain = nonEffectivelyFinal;

        // NO COMPILE ERROR
        Predicate<Long> isOver9000 = input -> input > finalAgain;
    }
}
