//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 5 - Working with Records
//

import java.time.LocalDateTime


record User(String username,
                   boolean active,
                   LocalDateTime lastLogin) {
    // NO BODY
}

var user = new User("ben", true, LocalDateTime.now());

System.out.println("username = " + user.username());
