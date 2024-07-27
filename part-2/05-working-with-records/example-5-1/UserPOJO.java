//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 5 - Working With Records
//
// Example 5-1. Simple User POJO
//

import java.time.LocalDateTime;
import java.util.Objects;

public final class UserPOJO {

    private String        username;
    private boolean       active;
    private LocalDateTime lastLogin;

    public UserPOJO() { }

    public UserPOJO(String username,
                    boolean active,
                    LocalDateTime lastLogin) {
        this.username = username;
        this.active = active;
        this.lastLogin = lastLogin;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isActive() {
        return this.active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public LocalDateTime getLastLogin() {
        return this.lastLogin;
    }

    public void setLastLogin(LocalDateTime lastLogin) {
        this.lastLogin = lastLogin;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.username, this.active, this.lastLogin);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        UserPOJO other = (UserPOJO) obj;
        return Objects.equals(this.username, other.username)
               && this.active == other.active
               && Objects.equals(this.lastLogin, other.lastLogin);
    }

    @Override
    public String toString() {
        return new StringBuilder().append("UserPOJO [username=")
                                  .append(this.username)
                                  .append(", active=")
                                  .append(this.active)
                                  .append(", lastLogin=")
                                  .append(this.lastLogin)
                                  .append("]")
                                  .toString();
    }

    public static void main(String... args) {

        var user = new UserPOJO();
        user.setUsername("ben");
        user.setActive(true);

        System.out.println("user = " + user);
    }
}
