//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 6 - Data Processing with Streams
//
// Example 6-7. Shape flatMap versus mapMulti
//

import java.util.List;
import java.util.stream.Stream;

public class FlatMapMapMulti {

    record Shape(int corners) implements Comparable<Shape> {

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

    public static void main(String... args) {

        // FLATMAP

        Stream<Shape> flatMap =
            Stream.of(Shape.square(), Shape.triangle(), Shape.circle())
                  .map(Shape::twice)
                  .flatMap(List::stream);

        flatMap.forEach(System.out::println);


        // MAPMULTI

        Stream<Shape> mapMulti =
            Stream.of(Shape.square(), Shape.triangle(), Shape.circle())
                  .mapMulti((shape, downstream) -> shape.twice()
                                                        .forEach(downstream::accept));

        mapMulti.forEach(System.out::println);
    }
}
