/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 3 - Functional JDK
 */

Predicate<Integer> over9000 = $ -> $ > 9_000;

Boolean result = over9000.test(1_234);
