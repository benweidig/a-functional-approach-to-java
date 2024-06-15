//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 9 - Handling null with Optionals
//
// Example 9-8. Finding an active admin without Optionals
//

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

record Permissions(List<String> permissions, Group group) {

    public boolean isEmpty() {
        return permissions.isEmpty();
    }
}

record Group(Optional<User> admin) {
    // NO BODY
}

record User(boolean isActive) {
    // NO BODY
}

User admin = new User(true);

Group group = new Group(Optional.of(admin));

Permissions permissions = new Permissions(List.of("A", "B", "C"),
                                          group);

boolean isActiveAdmin = false;

if (permissions != null && !permissions.isEmpty()) {

    if (permissions.group() != null) {
        var group = permissions.group();
        var maybeAdmin = group.admin();

        if (maybeAdmin.isPresent()) {
            var admin = maybeAdmin.orElseThrow();
            isActiveAdmin = admin.isActive();
        }
    }
}

System.out.println("Is Active Admin: " + isActiveAdmin);
