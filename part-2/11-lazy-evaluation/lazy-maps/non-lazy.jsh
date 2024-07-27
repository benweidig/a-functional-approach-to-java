//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 11 - Lazy Evaluation
//

import java.util.HashMap
import java.util.Map

// SETUP

record User(String email, String name) { }

Map<String, User> users = new HashMap<>();
users.put("john@doe.com", new User("john@doe.com", "John Doe"));


User loadUser(String email) {
    return new User("jane@doe.com", "Jane Doe");
}

// RELEVANT CODE

String email = "jane@doe.com"

User user = users.get(email)

if (user == null) {
    user = loadUser(email);
    users.put(email, user);
}

System.out.println("user = " + user)
