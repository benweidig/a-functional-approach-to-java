/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 5 - Working with Records
 */

public record Point(int x, int y) {

    public static final class Builder {

        private int x;
        private int y;

        public Builder(Point point) {
            this.x = point.x();
            this.y = point.y();
        }

        public Builder x(int x) {
            this.x = x;
            return this;
        }

        public Builder y(int y) {
        this.y = y;
        return this;
        }

        public Point build() {
        return new Point(this.x, this.y);
        }
    }
}


var original = new Point(23, 42);

var updated = new Point.Builder(original)
                       .x(5)
                       .build();
