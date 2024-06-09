import java.util.function.Function;

/**
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 3 - Functional JDK
 *
 * Example 3-2. Functional composition direction
 */
public class FunctionalComposition {

    public static void main(String[] args) {
        Function<String, String> removeLowerCaseA = str -> str.replace("a", "");
        Function<String, String> upperCase = String::toUpperCase;

        var input = "abcd";

        String leftToRight = removeLowerCaseA.andThen(upperCase).apply(input);

        String rightToLeft = upperCase.compose(removeLowerCaseA).apply(input);

        boolean result = leftToRight.equals(rightToLeft);
        System.out.println(result);
    }
}
