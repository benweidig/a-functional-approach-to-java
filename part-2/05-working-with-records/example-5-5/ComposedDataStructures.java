//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 5 - Working with Records
//
// Example 5-5. Canonical constructors in composed data structures
//

public class ComposedDataStructures {

    record Origin(int x, int y) {
        // NO BODY
    }

    record Rectangle(Origin origin, int width, int height) {
        // NO BODY
    }

    public static void main(String[] args) {
        var rectangle = new Rectangle(new Origin(23, 42), 300, 400);

        System.out.println("rectangle = " + rectangle);
    }
}
