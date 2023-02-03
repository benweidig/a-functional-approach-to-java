/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 3 - Functional JDK
 */

Function<String, Integer> stringLength = $ -> $ != null ? $.length() : 0;

var result = stringLength.apply("Hello, Function!");
