/**
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 2 - Functional Java
 * 
 * Example 2-3. Lambda variable capture
 */
public class LambdaCapture {

    public static void main(String... args) {
        Runnable r = capture();
        r.run();
    }

    private static Runnable capture() {
        // The variable is declared in the scope of capture
        var theAnswer = 42;

        Runnable printAnswer =
            // The lambda capture theAnswer for its operation
            () -> System.out.println("the answer is " + theAnswer);

        return printAnswer;
    }
}
