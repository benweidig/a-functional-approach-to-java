import java.util.function.Function;

/**
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 3 - Functional JDK
 * 
 * Figure 3-1. java.util.function.Function<T,R>
 */
public class FunctionExample {

    public static void main(String[] args) {

        Function<String, Integer> stringLength = str -> str != null ? str.length() : 0;

        var result = stringLength.apply("Hello, Function!");

        System.out.println(result);
    }
}
