/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 5 - Working with Records
 */

public record Origin(int x, int y) {
    // Additional constructor for convenience
    public Origin() {
        this(0, 0);
    }
}


public record Rectangle(Origin origin, int width, int height) {

    // Multiple convenience constructors
    
    public Rectangle(int x, int y, int width, int height) {
        this(new Origin(x, y), width, height);
    }

    public Rectangle(int width, int height) {
        this(new Origin(), width, height);
    }
}

var rectangle1 = new Rectangle(300, 400);
var rectangle2 = new Rectangle(new Origin(), 300, 400);
var rectangle3 = new Rectangle(new Origin(0, 0), 300, 400);

rectangle1.equals(rectangle2);
rectangle2.equals(rectangle3);
rectangle3.equals(rectangle1);
