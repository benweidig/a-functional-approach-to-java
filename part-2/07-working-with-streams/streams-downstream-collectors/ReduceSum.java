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

public class ReduceSum {

    record User(UUID id,
                String group,
                LocalDateTime lastLogin,
                List<String> logEntries) { }

    public static void main(String... args) {

        List<User> users =
            List.of(new User(UUID.randomUUID(), "admin", LocalDateTime.now().minusDays(23L), List.of("1", "2")),
                    new User(UUID.randomUUID(), "user", null, Collections.emptyList()),
                    new User(UUID.randomUUID(), "user", LocalDateTime.now().minusDays(42L), List.of("A", "B")));

        var downstream =
            Collectors.reducing(0,                                       // identity
                                (User user) -> user.logEntries().size(), // mapper
                                Integer::sum);                           // op

        Map<UUID, Integer> logCountPerUserId =
            users.stream()
                 .collect(Collectors.groupingBy(User::id, downstream));

        logCountPerUserId.forEach((uuid, count) -> System.out.println(String.format("%s: %d", uuid, count)));
    }
}
