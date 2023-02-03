/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 9 - Handling null with Optionals
 */

import java.util.Optional;

String hasValue = "Optionals are awesome!";
Optional<String> maybeValue = Optional.of(hasValue);

String nullRef = null;
Optional<String> emptyOptional = Optional.of(nullRef);
// => throws NullPointerException
