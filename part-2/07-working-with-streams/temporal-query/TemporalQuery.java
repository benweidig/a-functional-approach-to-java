//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 7 - Working With Streams
//

import java.time.LocalDateTime;
import java.time.LocalTime;

public class TemporalQuery {

    public static void main(String... args) {

        boolean isItTeaTime =
            LocalDateTime.now()
                         .query(temporal -> {
                var time = LocalTime.from(temporal);
                return time.getHour() >= 16;
            });
        System.out.println("Time for tea? " + isItTeaTime);

        // TemporalQuery<LocalTime> == Function<TemporalAccessor,Localtime>
        LocalTime time = LocalDateTime.now()
                                      .query(LocalTime::from);
        System.out.println("Current time: " + time);
    }
}
