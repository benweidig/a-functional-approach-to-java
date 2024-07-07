import java.time.LocalDateTime;
import java.util.Objects;

/**
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 5 - Working with Records
 */
public class CompactConstructor {
    record User(String username,
                boolean active,
                LocalDateTime lastLogin) {

        public User {

            Objects.requireNonNull(username);
            Objects.requireNonNull(lastLogin);

            username = username.toLowerCase();
        }
    }


    public static void main(String... args) {

        var user = new User("BEN", true, LocalDateTime.now());

        System.out.println(user);

        var throwingUser = new User(null, true, LocalDateTime.now());

    }
}
