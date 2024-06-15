//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 9 - Handling null with Optionals
//
// Example 9-2. null type ambiguity
//

// "TYPE-LESS" NULL AS AN ARGUMENT

void methodAcceptingString(String str) {
    // ...
}

methodAcceptingString(null);


// ACCESSING A "TYPED" NULL

String name = null;

var lowerCaseName = name.toLowerCase();
// => NullPointerException


// TEST TYPE OF NULL

var notString = name instanceof String;
// => false

var stillNotString = ((String) name) instanceof String;
// => false