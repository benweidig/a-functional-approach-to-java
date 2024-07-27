//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 5 - Working with Records
//

record Point(int x, int y) {

    static final class Builder {

        private int x;
        private int y;

        Builder(Point point) {
            this.x = point.x();
            this.y = point.y();
        }

        Builder x(int x) {
            this.x = x;
            return this;
        }

        Builder y(int y) {
            this.y = y;
            return this;
        }

        Point build() {
            return new Point(this.x, this.y);
        }
    }
}

{
    var original = new Point(23, 42);
    System.out.println("original = " + original);


    var updated = new Point.Builder(original)
                           .x(5)
                           .build();

    System.out.println("updated = " + updated);
}
