import java.time.LocalDateTime;
import java.util.Objects;

/**
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 5 - Working With Records
 * 
 * User type as a Record
 */
public record UserRecord(String username,
                         boolean active,
                         LocalDateTime lastLogin) {
    // NO BODY
}
