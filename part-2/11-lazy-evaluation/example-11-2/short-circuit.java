//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 11 - Lazy Evaluation
//
// Example 11-2. Usage of logical short-circuit operators
//

boolean left() {
    return true;
}

boolean right() {
    return true;
}

// WON'T COMPILE: unused result
// left() || right();


// COMPILES: used as if condition

if (left() || right()) {
    // ...
}

// COMPILES: used as variable assignment

var result = left() || right();
