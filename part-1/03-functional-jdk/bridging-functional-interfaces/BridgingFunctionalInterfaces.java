//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 3 - Functional JDK
//
// Why So Many Functional Interface Variants?
// > Bridging Functional Interfaces
//

import java.util.function.Predicate;

public class BridgingFunctionalInterfaces {

    interface LikePredicate<T> {

        boolean test(T value);
    }

    public static void main(String[] args) {

        LikePredicate<String> isNull = str -> str == null;

        /*
        Predicate<String> wontCompile = isNull;
        // Error:
        // incompatible types: LikePredicate<java.lang.String> cannot be
        // converted to java.util.function.Predicate<java.lang.String>

        Predicate<String> wontCompileEither = (Predicate<String>) isNull;
        // Exception java.lang.ClassCastException: class LikePredicate
        // cannot be cast to class java.util.function.Predicate
        */

        Predicate<String> thisIsFine = isNull::test;
    }

}
