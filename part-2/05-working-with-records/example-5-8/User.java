//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 5 - Working with Records
//
// Example 5-8. Neste builder
//
//

import java.time.LocalDateTime;

public record User(String username, boolean active, LocalDateTime lastLogin) {

    // NO BODY
    public static final class Builder {

        private final String username;

        private boolean       active;
        private LocalDateTime lastLogin;

        public Builder(String username) {
            this.username = username;
            this.active = true;
        }

        public Builder active(boolean isActive) {
            if (this.active == false) {
                throw new IllegalArgumentException("...");
            }

            this.active = isActive;

            return this;
        }

        public Builder lastLogin(LocalDateTime lastLogin) {
            this.lastLogin = lastLogin;

            return this;
        }

        public User build() {
            return new User(this.username, this.active, this.lastLogin);
        }
    }
}
