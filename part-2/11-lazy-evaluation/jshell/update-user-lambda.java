/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 11 - Lazy Evaluation
 *
 * Example 11-4. Updating a User with a lambda
 */

import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;


record Role(String name) {}

record User(List<Role> roles) {}

class DAO {
    public List<Role> loadAllAvailableRoles() {
        return List.of(new Role("admin"),
                       new Role("guest"));
    }
}

User updateUser(User user,
                Supplier<List<Role>> availableRolesFn) {
    return new User(availableRolesFn.get());
}


var dao = new DAO();

// HOW TO USE

var user = new User(Collections.emptyList());

var updatedUser = updateUser(user, dao::loadAllAvailableRoles);
