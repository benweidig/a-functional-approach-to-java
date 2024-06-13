//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 7 - Working With Streams
//

import java.time.LocalDateTime;
import java.time.LocalTime;

boolean isItTeaTime = LocalDateTime.now()
                                   .query(temporal -> {
                                        var time = LocalTime.from(temporal);
                                        return time.getHour() >= 16;
                                   });

// TemporalQuery<LocalTime> == Function<TemporalAccessor,Localtime>
LocalTime time = LocalDateTime.now().query(LocalTime::from);
