/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 2 - Functional Java
 */

Function<String, String> helloWorld = name -> "hello, " + name + "!";

var result = helloWorld.apply("Ben");