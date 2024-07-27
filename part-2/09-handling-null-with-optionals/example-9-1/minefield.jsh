//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 9 - Handling null with Optionals
//
// Example 9-1. A minefield of possible nulls
//

record User(long id,
            String firstname,
            String lastname) {

    String fullname() {
        return String.format("%s %s", firstname(), lastname());
    }

    String initials() {
        return String.format("%s%s",
                             firstname().substring(0, 1),
                             lastname().substring(0, 1));
    }
}

var user = new User(42L, "Ben", null);

var fullname = user.fullname();
System.out.println("fullname = " + fullname);

var initials = user.initials();
// => NullPointerException
System.out.println("initials = " + initials);

