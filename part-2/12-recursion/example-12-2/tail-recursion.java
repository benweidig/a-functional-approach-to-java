//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 12 - Recursion
//
// Example 12-2. Calculating factorials with tail recursion
//

long factorialTail(long n,
                   long accumulator) {

    if (n == 1L) {
        return accumulator;
    }

    var nextN = n - 1L;
    var nextAccumulator = n * accumulator;

    return factorialTail(nextN, nextAccumulator);
}

var result = factorialTail(4L, 1L);
System.out.println("result: " + result);
