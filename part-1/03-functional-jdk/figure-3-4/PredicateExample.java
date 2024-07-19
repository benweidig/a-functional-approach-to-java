//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 3 - Functional JDK
//
// Figure 3-4. java.util.function.Predicate<T>
//

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        Predicate<Integer> over9000 = i -> i > 9_000;

        boolean result = over9000.test(1_234);

        System.out.println("over 9000 = " + result);
    }
}
