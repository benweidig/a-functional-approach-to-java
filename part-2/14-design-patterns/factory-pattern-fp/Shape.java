//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 14 - Design Patterns
//

public abstract class Shape {

    public Shape(int corners, Color color, ShapeType type) {
        this.corners = corners;
        this.color = color;
        this.type = type;
    }

    private final int corners;
    private final Color color;
    private final ShapeType type;

    public int corners() {
        return this.corners;
    }

    Color color() {
        return this.color;
    }

    ShapeType type() {
        return this.type;
    }

    @Override
    public String toString() {
        return String.format("%s[corners=%d, color=%s]", type(), corners(), color());
    }
}
