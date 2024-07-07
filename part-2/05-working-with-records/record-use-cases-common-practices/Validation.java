/**
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 5 - Working with Records
 */
public class Validation {

    record NeedsValidation(int x, int y) {
    
        NeedsValidation {
            if (x < y) {
                throw new IllegalArgumentException("x must be equal or greater than y");
            }
        }
    }

    public static void main(String... args) {
        var throwsAnException = new NeedsValidation(23, 42);
    }
}
