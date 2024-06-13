//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 7 - Working With Streams
//

import java.util.stream.IntStream;

for (int idx = 1; idx < 5; idx++) {
    System.out.println(idx);
}

IntStream.iterate(1,
                  idx -> idx < 5,
                  idx -> idx + 1)
         .forEachOrdered(System.out::println);
