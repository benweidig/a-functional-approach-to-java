//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 8 - Parallel Data Processing with Streams
//
// Example 8-5. Random number statistics
//

import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.function.IntUnaryOperator;

public class RandomNumberStatsIntStreamSequential {

    public static void main(String... args) {

        IntUnaryOperator multiplyByTwo = in -> in * 2;

        var rnd = new Random();

        // PARALLEL IntStream
        var parallelStats = rnd.ints(100_000_000)
                .parallel()
                .map(multiplyByTwo)
                .map(multiplyByTwo)
                .summaryStatistics();

        System.out.println("Stats (parallel): " + parallelStats);
    }
}
