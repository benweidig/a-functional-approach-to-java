/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 2 - Functional Java
 * 
 * Static method references
 */

 import java.util.function.Function;

 public class MethodReferencesStatic {
 
    public static void main(String... args) {

        // LAMBDA
        Function<Integer, String> asLambda = i -> Integer.toHexString(i);

        // STATIC METHOD REFERENCE
        Function<Integer, String> asRef = Integer::tohexString;
    }
}
