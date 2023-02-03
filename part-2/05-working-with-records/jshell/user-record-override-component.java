/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 5 - Working with Records
 */

import java.time.LocalDateTime;

public record User(String username,
                   boolean active,
                   LocalDateTime lastLogin) {

    @Override
    public String username() {
        if (this.username == null) {
            return "n/a";
        }

        return this.username;
    }
}

var user = new User(null, true, LocalDateTime.now());

var username = user.username();
