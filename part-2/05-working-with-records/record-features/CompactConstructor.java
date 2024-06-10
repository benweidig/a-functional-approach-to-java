import java.time.LocalDateTime;
import java.util.Objects;

/**
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 5 - Working with Records
 */
public record CompactConstructor(String username,
                                 boolean active,
                                 LocalDateTime lastLogin) {

    public CompactConstructor {

        Objects.requireNonNull(username);
        Objects.requireNonNull(lastLogin);

        username = username.toLowerCase();
    }
}
