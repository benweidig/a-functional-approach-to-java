//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 5 - Working with Records
//
// Example 5-10. Group membership as sealed types instead of Optional<String>
//

import java.time.LocalDateTime;

public class SealedGroups {

    sealed interface Membership permits Group, NoGroup {
        // NO BODY
    }

    record Group(String name) implements Membership {
        // NO BODY
    }

    record NoGroup() implements Membership {
        // NO BODY
    }

    record User(String username,
                boolean active,
                Membership membership,
                LocalDateTime lastLogin) {
        // NO BODY
    }

    public static void main(String... args) {

        User user = new User("ben",
                             true,
                             new Group("admin"),
                             LocalDateTime.now());

        System.out.println("user = " + user);
    }
}
