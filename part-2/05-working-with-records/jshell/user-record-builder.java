/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 5 - Working with Records
 */

import java.time.LocalDateTime;

public record User(String username,
                   boolean active,
                   LocalDateTime lastLogin) {

}


public final class UserBuilder {

    private final String username;

    private boolean       active;
    private LocalDateTime lastLogin;

    public UserBuilder(String username) {
        this.username = username;
        this.active = true;
    }

    public UserBuilder active(boolean isActive) {
        if (this.active == false) {
            throw new IllegalArgumentException("...");
        }

        this.active = isActive;

        return this;
    }

    public UserBuilder lastLogin(LocalDateTime lastLogin) {
        this.lastLogin = lastLogin;

        return this;
    }

    public User build() {
        return new User(this.username, this.active, this.lastLogin);
    }
}

var builder = new UserBuilder("ben").active(false)
                                    .lastLogin(LocalDateTime.now());

var user = builder.build();
