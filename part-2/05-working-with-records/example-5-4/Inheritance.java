/**
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 5 - Working with Records
 * 
 * Example 5-4. Using interfaces with Records as templates
 */
public class Inheritance {

    // SHARED INTERFACE DEFINING COMPONENTS
    // PLUS DEFAULT METHOD
    interface Origin {

        int x();

        int y();

        default String origin() {
            return String.format("(%d/%d)", x(), y());
        }
    }

    // ANOTHER SHARED INTERFACE
    interface Area {

        float area();
    }

    // RECORD IMPLEMENTING FIRST SHARED INTERFACE
    // WITH ITS COMPONENTS FULFILLING IT

    record Point(int x, int y) implements Origin {
        // NO BODY
    }

    // RECORDS IMPLEMENTING BOTH SHARED INTERFACES
    // BUT IT NEEDS TO PROVIDE AN IMPLEMENTATION
    // FOR "float area()"

    record Rectangle(int x, int y, int width, int height) implements Origin, Area {

        @Override
        public float area() {
            return width() * height();
        }
    }

    record Circle(int x, int y, int radius) implements Origin, Area {

        @Override
        public float area() {
            return (float) Math.PI * radius() * radius();
        }
    }

    public static void main(String... args) {

        Circle c = new Circle(23, 42, 12);

        System.out.println(c.area());
    }
}
