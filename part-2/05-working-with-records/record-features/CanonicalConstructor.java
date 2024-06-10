import java.time.LocalDateTime;
import java.util.Objects;

/**
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 5 - Working with Records
 */
public record CanonicalConstructor(String username,
                                   boolean active,
                                   LocalDateTime lastLogin) {

    public CanonicalConstructor(String username,
                                boolean active,
                                LocalDateTime lastLogin) {
    
        Objects.requireNonNull(username);
        Objects.requireNonNull(lastLogin);

        this.username = username;
        this.active = active;
        this.lastLogin = lastLogin;
    }
}
