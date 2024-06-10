import java.util.Optional;
import java.time.LocalDate;

/**
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 5 - Working with Records
 */
public record UserConvenienceConstructor(String username,
                                         boolean active,
                                         Optional<String> group,
                                         LocalDateTime lastLogin) {

    public UserConvenienceConstructor(String username,
                                      boolean active,
                                      String group,
                                      LocalDateTime lastLogin) {
        this(username,
             active,
             Optional.ofNullable(group),
             lastLogin);
    }
}
