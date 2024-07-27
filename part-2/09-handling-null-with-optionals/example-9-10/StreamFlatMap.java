//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 9 - Handling null with Optionals
//
// Example 9-10. Optionals as Stream elements with flatMap
//

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class StreamFlatMap {

    record Permissions(List<String> permissions, Group group) {
    
        boolean isEmpty() {
            return permissions.isEmpty();
        }
    }

    record Group(Optional<User> admin) { }

    record User(boolean isActive) { }

    public static void main(String... args) {

        User admin = new User(true);

        Group group = new Group(Optional.of(admin));

        List<Permissions> permissions = List.of(new Permissions(List.of("A", "B", "C"),
                                                                group));

                                                                List<User> activeUsers =
            permissions.stream()
                       .filter(Predicate.not(Permissions::isEmpty))
                       .map(Permissions::group)
                       .map(Group::admin)
                       .flatMap(Optional::stream)
                       .filter(User::isActive)
                       .toList();

        System.out.println("activeUsers = " + activeUsers);
    }
}
