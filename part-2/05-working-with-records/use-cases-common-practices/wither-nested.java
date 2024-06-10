//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 5 - Working with Records
//

record Point(int x, int y) {

    With with() {
        return new With(this);
    }

    record With(Point source) {

        Point x(int x) {
            return new Point(x, source.y());
        }

        Point y(int y) {
            return new Point(source.x(), y);
        }
    }  
}

var sourcePoint = new Point(23, 42);
var modifiedPoint = sourcePoint.with().x(5);
