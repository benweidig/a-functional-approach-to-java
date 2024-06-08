/**
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 2 - Functional Java
 * 
 * Constructor references
 */
import java.util.Locale;
import java.util.function.Function;

public class MethodReferencesConstructor {

    public static void main(String... args) {

        // LAMBDA
        Function<String, Locale> newLocaleLambda = language -> new Locale(language);

        // CONSTRUCTOR REFERENCE
        Function<String, Locale> newLocaleRef = Locale::new;
    }
}
