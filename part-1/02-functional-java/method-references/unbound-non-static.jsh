//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 2 - Functional Java
//
// Unbound non-static method references
//

import java.util.function.Function


// LAMBDA
Function<String, String> toLowerCaseLambda = str -> str.toLowerCase()

var lambda = toLowerCaseLambda.apply("LAMBDA")
System.out.println("lambda = " + lambda)


// UNBOUND NON-STATIC METHOD REFERENCE
Function<String, String> toLowerCaseRef = String::toLowerCase

var methodRef = toLowerCaseRef.apply("METHOD REF")
System.out.println("methodRef = " + methodRef)
