//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 5 - Working with Records
//

import java.time.LocalDateTime;

public class DerivedState {

    record User(String username,
                boolean active,
                LocalDateTime lastLogin) {

        boolean hasLoggedInAtLeastOnce() {
            return this.lastLogin != null;
        }
    }

    public static void main(String[] args) {

        var neverLoggedIn = new User("ben",
                                     true,
                                     null);

        System.out.println("Logged in before = " + neverLoggedIn.hasLoggedInAtLeastOnce());
    }
}
