/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 2 - Functional Java
 *
 * Example 2-4. Change data behind a final variable
 */

import java.util.ArrayList;
import java.util.List;

public class ReassignFinalVariable {

    public static void main(String... args) {
        final List<String> wordList = new ArrayList<>();

        // COMPILES FINE
        Runnable addItemInLambda = () ->
            wordList.add("adding is fine");


        // WON'T COMPILE:
        wordList = List.of("assigning", "another", "List", "is", "not");
    }
}

/*
 * COMPILER ERROR:
 * ReassignFinalVariable.java:21: error: cannot assign a value to final variable wordList
 *     wordList = List.of("assigning", "another", "List", "is", "not");
 *     ^
 */
