/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 2 - Functional Java
 */

// LAMBDA
Function<String, String> toLowerCaseLambda = $ -> $.toLowerCase();

// UNBOUND NON-STATIC METHOD REFERENCE
Function<String, String> toLowerCaseRef = String::toLowerCase;
