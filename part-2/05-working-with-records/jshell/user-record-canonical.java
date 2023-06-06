/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 5 - Working with Records
 */

import java.time.LocalDateTime;

public record User(String username,
                   boolean active,
                   LocalDateTime lastLogin) {

    public User(String username,
                boolean active,
                LocalDateTime lastLogin) {
    
        Objects.requireNonNull(username);
        Objects.requireNonNull(lastLogin);

        this.username = username;
        this.active = active;
        this.lastLogin = lastLogin;
    }
}
