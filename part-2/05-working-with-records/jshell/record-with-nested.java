/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 5 - Working with Records
 */

public record Point(int x, int y) {

    public With with() {
        return new With(this);
    }

    public record With(Point source) {

        public Point x(int x) {
            return new Point(x, source.y());
        }

        public Point y(int y) {
            return new Point(source.x(), y);
        }
    }  
}


var sourcePoint = new Point(23, 42);
var modifiedPoint = sourcePoint.with().x(5);
