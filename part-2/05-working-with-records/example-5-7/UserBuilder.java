//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 5 - Working with Records
//
// Example 5-7. User Builder
//

import java.time.LocalDateTime;

public class UserBuilder {

    record User(String username, boolean active, LocalDateTime lastLogin) {
        // NO BODY
    }

    static final class Builder {

        private final String username;

        private boolean       active;
        private LocalDateTime lastLogin;

        Builder(String username) {
            this.username = username;
            this.active = true;
        }

        Builder active(boolean isActive) {
            if (this.active == false) {
                throw new IllegalArgumentException("...");
            }

            this.active = isActive;

            return this;
        }

        Builder lastLogin(LocalDateTime lastLogin) {
            this.lastLogin = lastLogin;

            return this;
        }

        User build() {
            return new User(this.username, this.active, this.lastLogin);
        }
    }

    public static void main(String[] args) {
        var builder = new Builder("ben").active(false).lastLogin(LocalDateTime.now());

        User user = builder.build();
        System.out.println("user = " + user);
    }
}
