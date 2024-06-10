/**
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 5 - Working with Records
 */
public class Wither {

    record Point(int x, int y) {

        Point withX(int newX) {
            return new Point(newX, y());
        }
    
        Point withY(int newY) {
            return new Point(x(), newY);
        }
    }

    public static void main(String... args) {
        
        Point point = new Point(23, 42);
        Point newPoint = point.withX(5);

        System.out.println(newPoint);
    }
}
