//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 8 - Parallel Data Processing with Streams
//
// Example 8-5. Random number statistics
//

import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.function.IntUnaryOperator;

public class RandomNumberStats {

    public static void main(String... args) {

        IntUnaryOperator multiplyByTwo = in -> in * 2;

        var rnd = new Random();

        // FOR-LOOP
        var loopStats = new IntSummaryStatistics();

        for (int idx = 0; idx < 100_000_000; idx++) {
            var value = rnd.nextInt();
            var subResult = multiplyByTwo.applyAsInt(value);
            var finalResult = multiplyByTwo.applyAsInt(subResult);
            loopStats.accept(finalResult);
        }

        System.out.println("for-loop = \n" + loopStats);

        // SEQUENTIAL IntStream
        var seqStats = rnd.ints(100_000_000)
                .map(multiplyByTwo)
                .map(multiplyByTwo)
                .summaryStatistics();

        System.out.println("\nStream (sequential) =\n " + seqStats);

 
        // PARALLEL IntStream
        var parallelStats = rnd.ints(100_000_000)
                .parallel()
                .map(multiplyByTwo)
                .map(multiplyByTwo)
                .summaryStatistics();

        System.out.println("\nStream (parallel) =\n" + parallelStats);

    }
}
