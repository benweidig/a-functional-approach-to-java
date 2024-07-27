//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 5 - Working with Records
//
// Example 5-6. Custom constructors for default values
//

public class CustomConstructorsDefaultValues {

    record Origin(int x, int y) {

        // Additional constructor for convenience
        Origin() {
            this(0, 0);
        }
    }

    record Rectangle(Origin origin, int width, int height) {

        // Multiple convenience constructors

        Rectangle(int x, int y, int width, int height) {
            this(new Origin(x, y), width, height);
        }

        Rectangle(int width, int height) {
            this(new Origin(), width, height);
        }
    }

    public static void main(String... args) {
        var rect1 = new Rectangle(300, 400);
        var rect2 = new Rectangle(new Origin(), 300, 400);
        var rect3 = new Rectangle(new Origin(0, 0), 300, 400);

        System.out.println("rect1 eq rect2 = " + rect1.equals(rect2));
        System.out.println("rect2 eq rect3 = " + rect2.equals(rect3));
        System.out.println("rect3 eq rect1 = " + rect3.equals(rect1));
    }
}
