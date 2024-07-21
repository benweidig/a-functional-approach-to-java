//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 7 - Working With Streams
//

import static java.util.stream.Collectors.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.Predicate;

public class Flatten {

    record User(UUID id, String group, LocalDateTime lastLogin, List<String> logEntries) {
    }

    public static void main(String... args) {

        List<User> users =
            List.of(new User(UUID.randomUUID(), "admin", LocalDateTime.now().minusDays(23L), List.of("1", "2")),
                    new User(UUID.randomUUID(), "user", LocalDate.now().atStartOfDay(), List.of("Z", "Y")),
                    new User(UUID.randomUUID(), "user", LocalDateTime.now().minusDays(42L), List.of("A", "B")));

        var downstream = flatMapping((User user) -> user.logEntries().stream(),
                                      toList());

        Map<String, List<String>> result =
            users.stream()
                 .collect(groupingBy(User::group, downstream));

        System.out.println("flatMapped = " + result);
    }
}
