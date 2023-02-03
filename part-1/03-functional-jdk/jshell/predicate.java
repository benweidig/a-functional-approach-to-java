/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 3 - Functional JDK
 */

Predciate<Integer> over9000 = $ -> $ > 9_000;

Integer result = over9000.test(1_234);
