//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 5 - Working with Records
//
// Example 5-11. User Record with sealed interface Membership
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

    record User(String username, boolean active, Membership membership, LocalDateTime lastLogin) {

        User {
            if (membership == null) {
                membership = new NoGroup();
            }
        }

        User(String username, boolean active, String groupName, LocalDateTime lastLogin) {
            this(username, active, groupName != null ? new Group(groupName) : null, lastLogin);
        }

        User(String username, boolean active, LocalDateTime lastLogin) {
            this(username, active, new NoGroup(), lastLogin);
        }
    }

    public static void main(String... args) {

        User user = new User("ben", true, new Group("admin"), LocalDateTime.now());

        System.out.println("user = " + user);
    }
}
