//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 7 - Working With Streams
//

import static java.util.stream.Collectors.filtering;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toSet;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.Predicate;

public class Filter {

    record User(UUID id, String group, LocalDateTime lastLogin, List<String> logEntries) {
    }

    public static void main(String... args) {

        List<User> users =
            List.of(new User(UUID.randomUUID(), "admin", LocalDateTime.now().minusDays(23L), List.of("1", "2")),
                    new User(UUID.randomUUID(), "user", LocalDate.now().atStartOfDay(), List.of("Z", "Y")),
                    new User(UUID.randomUUID(), "user", LocalDateTime.now().minusDays(42L), List.of("A", "B")));

        var startOfDay = LocalDate.now().atStartOfDay();

        Predicate<User> loggedInToday = Predicate.not(user -> user.lastLogin().isBefore(startOfDay));

        // WITH INTERMEDIATE FILTER

        Map<String, Set<UUID>> todaysLoginsByGroupWithFilterOp =
            users.stream()
                 .filter(loggedInToday)
                 .collect(groupingBy(User::group,
                                     mapping(User::id,
                                             toSet())));

        System.out.println("Filter-Op:");
        todaysLoginsByGroupWithFilterOp.forEach((group, uuids) -> System.out.println(String.format("%s: %s", group, uuids)));

        // WITH COLLECT FILTER

        Map<String, Set<UUID>> todaysLoginsByGroupWithFilteringCollector =
            users.stream()
                 .collect(groupingBy(User::group,
                                     filtering(loggedInToday,
                                     mapping(User::id,
                                             toSet()))));

        System.out.println("Filter-Collector:");
        todaysLoginsByGroupWithFilteringCollector.forEach((group, uuids) -> System.out.println(String.format("%s: %s", group, uuids)));
    }
}
