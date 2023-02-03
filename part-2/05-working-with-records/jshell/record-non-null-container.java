/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 5 - Working with Records
 */

import java.util.Optional;
import java.time.LocalDate;

public record User(String username,
                   boolean active,
                   Optional<String> group,
                   LocalDateTime lastLogin) {

    public User {
        Objects.requireNonNull(group, "Optional<String> group must not be null");
    }
}
