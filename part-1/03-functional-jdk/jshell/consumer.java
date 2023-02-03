/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 3 - Functional JDK
 */

Consumer<String> print = $ -> System.out.println($);

print.accept("Hello, Consumer!");
