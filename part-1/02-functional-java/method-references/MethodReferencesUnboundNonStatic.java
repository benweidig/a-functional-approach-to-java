import java.util.function.Function;

/**
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 2 - Functional Java
 * 
 * Unbound non-static method references
 */
public class MethodReferencesUnboundNonStatic {

    public static void main(String... args) {
        // LAMBDA
        Function<String, String> toLowerCaseLambda = str -> str.toLowerCase();

        // UNBOUND NON-STATIC METHOD REFERENCE
        Function<String, String> toLowerCaseRef = String::toLowerCase;
    }
}
