//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 14 - Design Patterns
//

import java.util.Objects;
import java.util.function.Function;

public enum ShapeType {
    CIRCLE(Circle::new),
    TRIANGLE(Triangle::new),
    SQUARE(Square::new),
    PENTAGON(Pentagon::new);

    public final Function<Color, Shape> factory;

    ShapeType(Function<Color, Shape> factory) {
        this.factory = factory;
    }

    public Shape newInstance(Color color) {
        Objects.requireNonNull(color);
        return this.factory.apply(color);
    }
}

