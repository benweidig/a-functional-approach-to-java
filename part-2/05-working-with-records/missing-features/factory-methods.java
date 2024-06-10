//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 5 - Working with Records
//

record Origin(int x, int y) {
    // NO BODY
}


record Rectangle(Origin origin, int width, int height) {

    Rectangle(int x, int y, int width, int height) {
        this(new Origin(x, y), width, height);
    }


    // FACTORY METHODS

    static Rectangle atX(int x, int width, int height) {
        return new Rectangle(x, 0, width, height);
    }

    static Rectangle atY(int y, int width, int height) {
        return new Rectangle(0, y, width, height);
    }
}

var rectangle1 = new Rectangle(0, 123, 300, 400);
var rectangle2 = Rectangle.atY(123, 300, 400);

rectangle1.equals(rectangle2);