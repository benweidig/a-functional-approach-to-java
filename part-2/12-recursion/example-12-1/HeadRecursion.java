//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 12 - Recursion
//
// Example 12-1. Calculating factorials with head recursion
//

public class HeadRecursion {

    static long factorialHead(long n) {
        if (n == 1L) {
            return 1L;
        }

        var nextN = n - 1L;

        return n * factorialHead(nextN);
    }

    public static void main(String... args) {

        var result = factorialHead(4L);
        System.out.println("result: " + result);
    }
}
