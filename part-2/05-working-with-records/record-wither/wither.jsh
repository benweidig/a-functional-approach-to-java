//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 5 - Working with Records
//

public record Point(int x, int y) {

    public Point withX(int newX) {
        return new Point(newX, y());
    }

    public Point withY(int newY) {
        return new Point(x(), newY);
    }
}

var source = new Point(23, 42);
System.out.println("source = " + source)

var modified = source.with().x(5)
System.out.println("modified = " + modified)
