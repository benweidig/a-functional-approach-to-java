/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 5 - Working With Records
 */

import java.time.LocalDateTime;
import java.util.Objects;

public record UserRecord(String username,
                         boolean active,
                         LocalDateTime lastLogin) {
}
