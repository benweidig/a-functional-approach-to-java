//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 9 - Handling null with Optionals
//

// DON'T INITIALIZE A VARIABLE TO NULL

// DON'T

String value = null;

if (condition) {
    value = "Condition is true";
} else {
    value = "Fallback if false";
}

// DO

String asTernary = condition ? "Condition is true"
                             : "Fallback if false";

String asRefactored = refactoredMethod(condition);


// ================================================================

// DON'T PASS, ACCEPT, OR RETURN NULL

public record User(long id, String firstname, String lastname) {

    // DO: Additional constructor with default values to avoid null values
    public User(long id) {
        this(id, "n/a", "n/a");
    }
}

public record User(long id, String firstname, String lastname) {

    // DO: Validate arguments against null
    public User {
        Objects.requireNonNull(firstname);
        Objects.requireNonNull(lastname);
    }
}
