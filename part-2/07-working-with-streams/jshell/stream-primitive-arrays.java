/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 7 - Working With Streams
 */

import java.util.Arrays;

int[] fibonacci = new int[] {
    0, 1, 1, 2, 3, 5, 8, 13, 21, 34
};

int[] evenNumbers = Arrays.stream(fibonacci)
                          .filter(value -> value % 2 == 0)
                          .toArray();

