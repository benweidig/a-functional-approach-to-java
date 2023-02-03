/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 7 - Working With Streams
 */

import java.util.Arrays;

String[] fruits = new String[] {
    "Banana",
    "Melon",
    "Orange"
};

String[] result = Arrays.stream(fruits)
                        .filter(fruit -> fruit.contains("a"))
                        .toArray(String[]::new);
