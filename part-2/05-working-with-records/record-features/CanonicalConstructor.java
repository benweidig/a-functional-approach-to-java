//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 5 - Working with Records
//

import java.time.LocalDateTime;
import java.util.Objects;

public class CanonicalConstructor {

    record User(String username,
                boolean active,
                LocalDateTime lastLogin) {

        public User(String username,
                    boolean active,
                    LocalDateTime lastLogin) {
        
            Objects.requireNonNull(username);
            Objects.requireNonNull(lastLogin);

            this.username = username.toLowerCase();
            this.active = active;
            this.lastLogin = lastLogin;
        }
    }

    public static void main(String... args) {

        var user = new User("BEN", true, LocalDateTime.now());

        System.out.println("user = " + user);

        // THIS CALL THROWS
        // var throwingUser = new User(null, true, LocalDateTime.now());

    }
}
