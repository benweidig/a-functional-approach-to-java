//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 7 - Working With Streams
//

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

Stream.generate(new AtomicInteger()::incrementAndGet)
      .parallel()
      .limit(1_000L)
      .mapToInt(Integer::valueOf)
      .max()
      .ifPresent(System.out::println);
