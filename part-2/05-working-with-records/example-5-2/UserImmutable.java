import java.time.LocalDateTime;
import java.util.Objects;

/**
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 5 - Working With Records
 *
 * Example 5-2. Simple immutable User type
 */
public final class UserImmutable {

    private final String        username;
    private final boolean       active;
    private final LocalDateTime lastLogin;

    public UserImmutable(String username,
                         boolean active,
                         LocalDateTime lastLogin) {
        this.username = username;
        this.active = active;
        this.lastLogin = lastLogin;
    }

    public String getUsername() {
        return this.username;
    }

    public boolean isActive() {
        return this.active;
    }

    public LocalDateTime getLastLogin() {
        return this.lastLogin;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.username,
                            this.active,
                            this.lastLogin);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        UserImmutable other = (UserImmutable) obj;
        return Objects.equals(this.username, other.username)
               && this.active == other.active
               && Objects.equals(this.lastLogin, other.lastLogin);
    }

    @Override
    public String toString() {
        return new StringBuilder().append("UserImmutable [username=")
                                  .append(this.username)
                                  .append(", active=")
                                  .append(this.active)
                                  .append(", lastLogin=")
                                  .append(this.lastLogin)
                                  .append("]")
                                  .toString();
    }


    public static void main(String... args) {

        var user = new UserImmutable("ben", true, null);

        System.out.println(user);
    }
}
