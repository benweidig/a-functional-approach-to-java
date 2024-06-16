//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 11 - Lazy Evaluation
//
// Example 11-5. A simple Thunk<T>
//

import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class ThunkSimple {

    public static class Thunk<T> implements Supplier<T> {

        private final Supplier<T> expression;
        private T result;

        private Thunk(Supplier<T> expression) {
            this.expression = expression;
        }

        @Override
        public T get() {
            if (this.result == null) {
                this.result = this.expression.get();
            }
            return this.result;
        }

        public static <T> Thunk<T> of(Supplier<T> expression) {
            if (expression instanceof Thunk<T>) {
                return (Thunk<T>) expression;
            }

            return new Thunk<>(expression);
        }
    }

    record Role(String name) { }

    record User(List<Role> roles) { }

    static class DAO {
        public List<Role> loadAllAvailableRoles() {
            return List.of(new Role("admin"), new Role("guest"));
        }
    }

    static User updateUser(User user, Supplier<List<Role>> availableRolesFn) {
        return new User(availableRolesFn.get());
    }

    public static void main(String... args) {
        var dao = new DAO();

        var user = new User(Collections.emptyList());

        var updatedUser = updateUser(user, Thunk.of(dao::loadAllAvailableRoles));

        System.out.println("Roles: " + updatedUser.roles().size());
    }
}
