//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 5 - Working with Records
//

public class WitherNested {

    record Point(int x, int y) {

        With with() {
            return new With(this);
        }

        record With(Point source) {

            Point x(int x) {
                return new Point(x, this.source.y());
            }

            Point y(int y) {
                return new Point(this.source.x(), y);
            }
        }
    }

    public static void main(String... args) {

        var source = new Point(23, 42);
        System.out.println("source = " + source);
        
        var modified = sourcePoint.with().x(5);
        System.out.println("source = " + source);
            }
}
