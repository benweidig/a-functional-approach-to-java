//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 9 - Handling null with Optionals
//
// Example 9-7. Intermediate operations to find an active admin
//

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class FilterMapOptional {

    record Permissions(List<String> permissions, Group group) {

        public boolean isEmpty() {
            return this.permissions.isEmpty();
        }
    }

    record Group(Optional<User> admin) {
        // NO BODY
    }

    record User(boolean isActive) {
        // NO BODY
    }

    public static void main(String... args) {

        User admin = new User(true);

        Group group = new Group(Optional.of(admin));

        Permissions permissions = new Permissions(List.of("A", "B", "C"), group);

        boolean isActiveAdmin =
            Optional.ofNullable(permissions)
                    .filter(Predicate.not(Permissions::isEmpty))
                    .map(Permissions::group)
                    .flatMap(Group::admin)
                    .map(User::isActive)
                    .orElse(Boolean.FALSE);

        System.out.println("Is Active Admin: " + isActiveAdmin);
    }
}
