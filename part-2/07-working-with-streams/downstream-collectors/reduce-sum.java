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

record User(UUID id,
            String group,
            LocalDateTime lastLogin,
            List<String> logEntries) { }

List<User> users = List.of(
    new User(UUID.randomUUID(), "admin", LocalDateTime.now().minusDays(23L), List.of("1", "2")),
    new User(UUID.randomUUID(), "user", null, Collections.emptyList()),
    new User(UUID.randomUUID(), "user", LocalDateTime.now().minusDays(42L), List.of("A", "B", "C"))
);


var downstream =
    Collectors.reducing(0,                                       // identity
                        (User user) -> user.logEntries().size(), // mapper
                        Integer::sum);                           // op

Map<UUID, Integer> logCountPerUserId =
    users.stream()
         .collect(Collectors.groupingBy(User::id, downstream));