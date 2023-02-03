/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 2 - Functional Java
 */

import java.time.LocalDate;

// LAMBDA BASED ON EXISTING OBJECT
var now = LocalDate.now();
Predicate<LocalDate> isAfterNowAsLambda = $ -> $.isAfter(now);

// BOUND NON-STATIC METHOD REFERENCE
Predicate<LocalDate> isAfterNowAsRef = now::isAfter;
