/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 5 - Working with Records
 */

// SHARED INTERFACE DEFINING COMPONENTS
// PLUS DEFAULT METHOD
public interface Origin {

    int x();
    int y();

    default String origin() {
        return String.format("(%d/%d)", x(), y());
    }
}


// ANOTHER SHARED INTERFACE
public interface Area {
    float area();
}


// RECORD IMPLEMENTING FIRST SHARED INTERFACE
// WITH ITS COMPONENTS FULFILLING IT

public record Point(int x, int y) implements Origin {
    // NO BODY
}


// RECORDS IMPLEMENTING BOTH SHARED INTERFACES
// BUT IT NEEDS TO PROVIDE AN IMPLEMENTATION
// FOR "float area()"

public record Rectangle(int x, int y, int width, int height)
    implements Origin, Area {

    public float area() {
        return (float) (width() * height());
    }
}


public record Circle(int x, int y, int radius)
    implements Origin, Area {

    public float area() {
        return (float) Math.PI * radius() * radius();
    }
}
