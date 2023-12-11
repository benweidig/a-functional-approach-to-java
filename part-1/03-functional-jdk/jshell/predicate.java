/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 3 - Functional JDK
 */

Predicate<Integer> over9000 = i -> i > 9_000;

boolean result = over9000.test(1_234);
