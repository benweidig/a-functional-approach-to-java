/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 3 - Functional JDK
 */

Function<String, String> removeLowerCaseA = $ -> $.replace("a", "");
Function<String, String> upperCase = String::toUpperCase;


var input = "abcd";

var leftToRight = removeLowerCaseA.andThen(upperCase)
                                  .apply(input);

var rightToLeft = upperCase.compose(removeLowerCaseA)
                           .apply(input);

leftToRight.equals(rightToLeft)
