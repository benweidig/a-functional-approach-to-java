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


var rect1 = new Rectangle(0, 123, 300, 400)
var rect2 = Rectangle.atY(123, 300, 400)

var isEqual = rect1.equals(rect2)
System.out.println("rect1 eq rect2 = " + isEqual)
