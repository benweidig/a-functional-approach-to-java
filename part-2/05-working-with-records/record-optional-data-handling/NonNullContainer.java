import java.util.Objects;
import java.util.Optional;
import java.time.LocalDateTime;

/**
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 5 - Working with Records
 */
public class NonNullContainer {

    record User(String username,
                boolean active,
                Optional<String> group,
                LocalDateTime lastLogin) {

        public User {
            Objects.requireNonNull(group, "Optional<String> group must not be null");
        }
    }

    public static void main(String... args) {
        
        var throwingUser = new User("ben", true, null, LocalDateTime.now());
    }
}
