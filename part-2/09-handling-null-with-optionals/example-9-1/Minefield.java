//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 9 - Handling null with Optionals
//
// Example 9-1. A minefield of possible nulls
//

public class Minefield {

    record User(long id,
            String firstname,
            String lastname) {

        String fullname() {
            return String.format("%s %s",
                                 firstname(),
                                 lastname());
        }

        String initials() {
            return String.format("%s%s",
                                 firstname().substring(0, 1),
                                 lastname().substring(0, 1));
        }
    }

    public static void main(String... args) {

        var user = new User(42L, "Ben", null);

        var fullname = user.fullname();
        System.out.println("Fullname: " + fullname);

        // => NullPointerException
        var initials = user.initials();
        System.out.println("Initials: " + initials);
    }
}
