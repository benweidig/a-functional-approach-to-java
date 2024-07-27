//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 11 - Lazy Evaluation
//
// Example 11-4. Updating a User with a lambda
//

import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class UpdateUserLambda {

    record Role(String name) { }

    record User(List<Role> roles) { }

    static User updateUser(User user,
                           Supplier<List<Role>> availableRolesFn) {
        return new User(availableRolesFn.get());
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
        
        var updatedUser = updateUser(user, dao::loadAllAvailableRoles);
        System.out.println("updated user = " + updatedUser);
    }
}
