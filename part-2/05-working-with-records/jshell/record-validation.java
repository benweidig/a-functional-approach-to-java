/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 5 - Working with Records
 */

public record NeedsValidation(int x, int y) {

    public NeedsValidation {
        if (x < y) {
            throw new IllegalArgumentException("x must be equal or greater than y");
        }
    }
}

var throwsAnException = new NeedsValidation(23, 42);
