//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 14 - Design Patterns
//

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public record User(String email,
                   String name,
                   List<String> permissions) {

    public User {
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("'email' must be set.");
        }

        if (permissions == null) {
            permissions = Collections.emptyList();
        }
    }

    public static class Builder {

        private String email;
        private String name;
        private final List<String> permissions = new ArrayList<>();

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder addPermission(String permission) {
            this.permissions.add(permission);
            return this;
        }

        public User build() {
            return new User(this.email,
                            this.name,
                            this.permissions);
        }
    }

    public static Builder builder() {
        return new Builder();
    }
}