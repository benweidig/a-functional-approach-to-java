//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 3 - Functional JDK
//
// Example 3-2. Functional composition direction
//

Function<String, String> removeLowerCaseA = str -> str.replace("a", "");
Function<String, String> upperCase = String::toUpperCase;


String input = "abcd";

String leftToRight = removeLowerCaseA.andThen(upperCase)
                                     .apply(input);

String rightToLeft = upperCase.compose(removeLowerCaseA).apply(input);

var result = leftToRight.equals(rightToLeft)
System.out.println("is equal = " + result)
