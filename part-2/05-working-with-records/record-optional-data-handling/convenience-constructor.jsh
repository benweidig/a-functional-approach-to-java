//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 5 - Working with Records
//

import java.util.Optional
import java.time.LocalDateTime

record User(String username,
            boolean active,
            Optional<String> group,
            LocalDateTime lastLogin) {

    User(String username,
         boolean active,
         String group,
         LocalDateTime lastLogin) {
        this(username,
             active,
             Optional.ofNullable(group),
             lastLogin);
    }

    User(String username,
         boolean active,
         LocalDateTime lastLogin) {
        this(username,
             active,
             Optional.empty(),
             lastLogin);
        }
}

var userWithGroup = new User("ben", true, "admin", LocalDateTime.now())
System.out.println("With group: " + userWithGroup)

var userWithoutGroup = new User("jane", true, LocalDateTime.now())
System.out.println("Without group: " + userWithoutGroup)
