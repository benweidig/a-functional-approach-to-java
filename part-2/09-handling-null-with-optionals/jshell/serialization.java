/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 9 - Handling null with Optionals
 *
 * Example 9-12. Using Optionals in Serializable types
 */

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Optional;

public class User implements Serializable {

    private UUID id;
    private String username;
    private LocalDateTime lastLogin;

    // ... usual getter/setter for id and username

    public Optional<LocalDateTime> getLastLogin() {
        return Optional.ofNullable(this.lastLogin);
    }

    public void setLastLogin(LocalDateTime lastLogin) {
        this.lastLogin = lastLogin;
    }
}
