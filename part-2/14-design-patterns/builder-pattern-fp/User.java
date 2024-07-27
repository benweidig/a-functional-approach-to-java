//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 14 - Design Patterns
//

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public record User(String email, String name, List<String> permissions) {

    public User {
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("'email' must be set.");
        }

        if (permissions == null) {
            permissions = Collections.emptyList();
        }
    }

    public static class Builder {

        private Supplier<String> emailSupplier;
        private Supplier<String> nameSupplier;
        private final List<String> permissions = new ArrayList<>();

        public Builder email(String email) {
            return email(() -> email);
        }

        public Builder email(Supplier<String> emailSupplier) {
            this.emailSupplier = emailSupplier;
            return this;
        }

        public Builder name(String name) {
            return name(() -> name);
        }

        public Builder name(Supplier<String> nameSupplier) {
            this.nameSupplier = nameSupplier;
            return this;
        }

        public Builder addPermission(String permission) {
            this.permissions.add(permission);
            return this;
        }

        public User build() {
            return new User(this.emailSupplier.get(),
                            this.nameSupplier.get(),
                            this.permissions);
        }
    }

    public static Builder builder() {
        return new Builder();
    }
}