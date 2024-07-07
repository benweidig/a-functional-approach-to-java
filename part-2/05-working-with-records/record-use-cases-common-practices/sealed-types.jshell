//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 5 - Working with Records
//


sealed interface Origin permits Point, Rectangle, Circle {

    int x();
    int y();

    default String origin() {
        return String.format("(%d/%d)", x(), y());
    }
}


record Point(int x, int y) implements Origin {
    // ...
}

record Rectangle(int x, int y, int width, int height) implements Origin {
    // ...
}


record Circle(int x, int y, int radius) implements Origin {
    // ...
}

record Triangle(int x1, int y1,
                int x2, int y2,
                int x3, int y3) implements Origin {
    // ...
}
// Error:
// class is not allowed to extend sealed class: Origin (as it is not
// listed in its 'permits' clause)
// record Triangle(int x1, int y1,
// ^------------------------------...


