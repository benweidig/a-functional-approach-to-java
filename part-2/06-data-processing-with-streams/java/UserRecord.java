/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 6 - Data Processing With Streams
 */

import java.time.LocalDateTime;
import java.util.Objects;

public record UserRecord(String username,
                         boolean active,
                         LocalDateTime lastLogin) {
}
