//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 2 - Functional Java
//
// Bound non-static method references
//

import java.time.LocalDate
import java.util.function.Function
import java.util.function.Predicate


// LAMBDA BASED ON EXISTING OBJECT
var now = LocalDate.now()
Predicate<LocalDate> isAfterNowAsLambda = $ -> $.isAfter(now)

// BOUND NON-STATIC METHOD REFERENCE
Predicate<LocalDate> isAfterNowAsRef = now::isAfter


// NO INTERMEDIATE

// BIND RETURN VALUE
Predicate<LocalDate> isAfterNowAsRef = LocalDate.now()::isAfter

// BIND STATIC FIELD
Function<Object, String> castToStr = String.class::cast
