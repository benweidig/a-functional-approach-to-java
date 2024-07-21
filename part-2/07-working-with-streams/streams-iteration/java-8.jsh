//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 7 - Working With Streams
//

import java.util.stream.IntStream;

System.out.println("for-loop")

for (int idx = 1; idx < 5; idx++) {
    System.out.println(idx);
}


System.out.println("\nIntStream.iterate");

{
    IntStream.iterate(1, idx -> idx + 1)
             .limit(4L)
             .forEachOrdered(System.out::println);
}
