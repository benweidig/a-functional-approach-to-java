//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 5 - Working with Records
//

import java.time.LocalDateTime;

public class OverrideComponentAccessor {

    record User(String username, boolean active, LocalDateTime lastLogin) {

        @Override
        public String username() {
            if (this.username == null) {
                return "n/a";
            }

            return this.username;
        }
    }

    public static void main(String[] args) {

        var user = new User(null, true, LocalDateTime.now());

        System.out.println("username via accessor =  " + user.username());
    }
}
