/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 4 - Immutabilty
 */

import java.util.ArrayList;
import java.util.List;

public class CollectionsFinalReferences {

    public static void main(String... args) {
        final List<String> fruits = new ArrayList<>();

        System.out.println(fruits.isEmpty());

        fruits.add("Apple");

        System.out.println(fruits.isEmpty());

        // WON'T COMPILE:
        // fruits = List.of("Mango", "Melon");
        //
        // ERROR
        // CollectionsFinalReferences.java:23: error: cannot assign a value to final variable fruits
        //         fruits = List.of("Mango", "Melon");
        //         ^
        // 1 error
    }
}
