/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 6 - Data Processing with Streams
 *
 * Example 6-7. Peeking into a Stream
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

List<Shape> result =
    Stream.of(Shape.square(), Shape.triangle(), Shape.circle())
          .map(Shape::twice)
          .flatMap(List::stream)
          .peek(shape -> System.out.println("current: " + shape))
          .filter(shape -> shape.corners() < 4)
          .collect(Collectors.toList());
