//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 8 - Parallel Data Processing with Streams
//
// Example 8-5. Random number statistics
//

import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.function.IntUnaryOperator;

IntUnaryOperator multiplyByTwo = in -> in * 2; 

var rnd = new Random(); 

// SEQUENTIAL IntStream 
var seqStats = rnd.ints(100_000_000)
                  .map(multiplyByTwo)
                  .map(multiplyByTwo)
                  .summaryStatistics();

System.out.println("Stats (sequential): " + seqStats);