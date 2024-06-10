import java.util.Optional;
import java.time.LocalDate;

//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 5 - Working with Records
//

record UserNonNullContainer(String username,
                           boolean active,
                           Optional<String> group,
                           LocalDateTime lastLogin) {

    public UserNonNullContainer {
        Objects.requireNonNull(group, "Optional<String> group must not be null");
    }
}
