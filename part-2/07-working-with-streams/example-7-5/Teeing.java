//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 7 - Working With Streams
// 
// Example 7-5. Counting logins
//

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Teeing {

    record User(UUID id,
            String group,
            LocalDateTime lastLogin,
            List<String> logEntries) {
    }

    record UserStats(long total,
            long neverLoggedIn) {
    }

    public static void main(String... args) {

        List<User> users = List.of(
                new User(UUID.randomUUID(), "admin", LocalDateTime.now().minusDays(23L), List.of("1", "2")),
                new User(UUID.randomUUID(), "user", LocalDate.now().atStartOfDay(), List.of("Z", "Y")),
                new User(UUID.randomUUID(), "user", null, Collections.emptyList()));

        UserStats result = users.stream()
                .collect(Collectors.teeing(Collectors.counting(),
                        Collectors.filtering(user -> user.lastLogin() == null,
                                             Collectors.counting()),
                        UserStats::new));

        System.out.println("Stats: " + result);
    }
}
