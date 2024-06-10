import java.time.LocalDateTime;

//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 5 - Working with Records
//

record User(String username,
                   boolean active,
                   LocalDateTime lastLogin) {
    // NO BODY
}

var user = new User("ben", true, LocalDateTime.now());

var username = user.username();
