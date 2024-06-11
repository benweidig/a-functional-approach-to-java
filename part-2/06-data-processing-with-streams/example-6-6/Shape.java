import java.util.List;

/**
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 6 - Data Processing with Streams
 *
 * Example 6-6. A simple Shape type
 */
public record Shape(int corners) implements Comparable<Shape> {

    // HELPER METHODS

    public boolean hasCorners() {
        return corners() > 0;
    }

    public List<Shape> twice() {
        return List.of(this, this);
    }

    @Override
    public int compareTo(Shape o) {
        return Integer.compare(corners(), o.corners());
    }

    // FACTORY METHODS

    public static Shape circle() {
        return new Shape(0);
    }

    public static Shape triangle() {
        return new Shape(3);
    }

    public static Shape square() {
        return new Shape(4);
    }
}
