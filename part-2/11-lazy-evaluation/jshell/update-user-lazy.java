/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 11 - Lazy Evaluation
 */

import java.util.Collections;
import java.util.List;


record Role(String name) {}

record User(List<Role> roles) {}

class DAO {
    public List<Role> loadAllAvailableRoles() {
        return List.of(new Role("admin"),
                       new Role("guest"));
    }
}

User updateUser(User user,
                DAO dao) {
    return new User(dao.loadAllAvailableRoles());
}


var dao = new DAO();

// HOW TO USE

var user = new User(Collections.emptyList());

var updatedUser = updateUser(user, dao);
