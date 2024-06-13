//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 7 - Working With Streams
//

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

public class TransformGroupBySimple {

    record User(UUID id, String group, LocalDateTime lastLogin, List<String> logEntries) {
    }

    public static void main(String[] args) {

        List<User> users = List.of(
            new User(UUID.randomUUID(), "admin", LocalDateTime.now().minusDays(23L), List.of("1", "2")),
            new User(UUID.randomUUID(), "user", null, Collections.emptyList()),
            new User(UUID.randomUUID(), "user", LocalDateTime.now().minusDays(42L), List.of("A", "B"))
        );

        Map<String, List<User>> lookup = users.stream().collect(Collectors.groupingBy(User::group));

        lookup.forEach((group, groupUsers) -> System.out.println(String.format("%s: %s", group, groupUsers)));
    }
}
