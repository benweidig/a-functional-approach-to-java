//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 11 - Lazy Evaluation
//

import java.util.HashMap;
import java.util.Map;

public class MapsLazy {

    record User(String email, String name) {
    }

    static User loadUser(String email) {
        return new User("jane@doe.com", "Jane Doe");
    }

    public static void main(String... args) {

        Map<String, User> users = new HashMap<>();
        users.put("john@doe.com", new User("john@doe.com", "John Doe"));

        String email = "jane@doe.com";
        User user = users.computeIfAbsent(email, MapsLazy::loadUser);

        System.out.println("User: " + user);
    }
}
