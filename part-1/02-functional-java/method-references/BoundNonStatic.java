//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 2 - Functional Java
//
// Bound non-static method references
//

import java.time.LocalDate;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferencesBoundNonStatic {

    public static void main(String... args) {

        boundNonStatic();

        boundNonStaticNoIntermediate();
    }

    private static void boundNonStatic() {
        // LAMBDA BASED ON EXISTING OBJECT
        var now = LocalDate.now();
        Predicate<LocalDate> isAfterNowAsLambda = $ -> $.isAfter(now);

        // BOUND NON-STATIC METHOD REFERENCE
        Predicate<LocalDate> isAfterNowAsRef = now::isAfter;
    }

    private static void boundNonStaticNoIntermediate() {
        // BIND RETURN VALUE
        Predicate<LocalDate> isAfterNowAsRef = LocalDate.now()::isAfter;

        // BIND STATIC FIELD
        Function<Object, String> castToStr = String.class::cast;
    }
}
