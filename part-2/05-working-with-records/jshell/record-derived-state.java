/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 5 - Working with Records
 */

import java.time.LocalDateTime;

public record User(String username,
                   boolean active,
                   LocalDateTime lastLogin) {

    public boolean hasLoggedInAtLeastOnce() {
        return this.lastLogin != null;
    }
}

var neverLoggedIn = new User("ben", true, null);

System.out.println(neverLoggedIn.hasLoggedInAtLeastOnce());
