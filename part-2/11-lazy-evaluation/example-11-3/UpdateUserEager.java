//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 11 - Lazy Evaluation
//
// Example 11-3. Updating a User with eager method arguments
//

import java.util.Collections;
import java.util.List;

public class UpdateUserEager {

    record Role(String name) { }

    record User(List<Role> roles) { }

    static User updateUser(User user, List<Role> availableRoles) {
        return new User(availableRoles);
    }

    static class DAO {

        public List<Role> loadAllAvailableRoles() {
            return List.of(new Role("admin"),
                           new Role("guest"));
        }
    }

    public static void main(String[] args) {

        var dao = new DAO();

        // HOW TO USE

        var user = new User(Collections.emptyList());
        System.out.println("user = " + user);

        var availableRoles = dao.loadAllAvailableRoles();

        var updatedUser = updateUser(user, availableRoles);
        System.out.println("updated user = " + updatedUser);
    }
}
