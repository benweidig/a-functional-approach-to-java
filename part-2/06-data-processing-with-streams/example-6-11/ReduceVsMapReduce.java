import java.util.stream.Stream;

/**
/* A FUNCTIONAL APPROACH TO JAVA
/* Chapter 6 - Data Processing with Streams
/*
/* Example 6-11. Three-arguments reduce() versus map + two-arguments reduce
 */
public class ReduceVsMapReduce {

    public static void main(String... args) {

        Integer reduceOnly = Stream.of("apple", "orange", "banana")
                                   .reduce(0,
                                           (acc, str) -> acc + str.length(),
                                           Integer::sum);

        System.out.println("reduceOnly: " + reduceOnly);

        int mapReduce = Stream.of("apple", "orange", "banana")
                              .mapToInt(String::length)
                              .reduce(0, (acc, length) -> acc + length);

        System.out.println("mapReduce: " + mapReduce);
    }
}
