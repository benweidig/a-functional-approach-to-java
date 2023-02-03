/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 11 - Lazy Evaluation
 */

import java.util.HashMap;
import java.util.Map;

Map<String, String> users = new HashMap<>();
users.put("john@doe.com", "John Doe");

var email = "jane@doe.com";

String getName(String email) {
    return "Jane Doe";
}

var user = users.computeIfAbsent(email, key -> getName(key));
