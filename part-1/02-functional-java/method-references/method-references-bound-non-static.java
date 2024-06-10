import java.time.LocalDate;

//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 2 - Functional Java
//
// Bound non-static method references
//

// LAMBDA BASED ON EXISTING OBJECT
var now = LocalDate.now();
Predicate<LocalDate> isAfterNowAsLambda = $ -> $.isAfter(now);

// BOUND NON-STATIC METHOD REFERENCE
Predicate<LocalDate> isAfterNowAsRef = now::isAfter;


// NO INTERMEDIATE

// BIND RETURN VALUE
Predicate<LocalDate> isAfterNowAsRef = LocalDate.now()::isAfter;

// BIND STATIC FIELD
Function<Object, String> castToStr = String.class::cast;