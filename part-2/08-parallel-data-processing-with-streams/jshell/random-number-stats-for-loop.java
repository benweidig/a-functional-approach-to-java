/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 8 - Parallel Data Processing with Streams
 *
 * Example 8-5. Random number statistics
 */

import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.function.IntUnaryOperator;

var elementsCount = 100_000_000;

IntUnaryOperator multiplyByTwo = in -> in * 2; 

var rnd = new Random(); 

// FOR-LOOP 
var loopStats = new IntSummaryStatistics();

for(int idx = 0; idx < elementsCount; idx++) {
    var value = rnd.nextInt();
    var subResult = multiplyByTwo.applyAsInt(value);
    var finalResult = multiplyByTwo.applyAsInt(subResult);
    loopStats.accept(finalResult);
}

System.out.println(loopStats);
