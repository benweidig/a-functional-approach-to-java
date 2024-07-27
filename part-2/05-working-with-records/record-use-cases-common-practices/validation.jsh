//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 5 - Working with Records
//

record NeedsValidation(int x, int y) {

    public NeedsValidation {
        if (x < y) {
            throw new IllegalArgumentException("x must be equal or greater than y");
        }
    }
}

var throwsAnException = new NeedsValidation(23, 42);
// Exception java.lang.IllegalArgumentException: x must be equal or greater than y
//       at NeedsValidation.<init> (#1:5)
//       at do_it$Aux (#2:1)
//       at (#2:1)
