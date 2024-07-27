//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 11 - Lazy Evaluation
//

import java.util.HashMap;
import java.util.Map;

public class NonLazy {

    record User(String email, String name) {
    }

    static User loadUser(String email) {
        return new User("jane@doe.com", "Jane Doe");
    }

    public static void main(String... args) {

        Map<String, User> users = new HashMap<>();
        users.put("john@doe.com", new User("john@doe.com", "John Doe"));

        var email = "jane@doe.com";

        var user = users.get(email);
        if (user == null) {
            user = loadUser(email);
            users.put(email, user);
        }

        System.out.println("user = " + user);
    }
}
