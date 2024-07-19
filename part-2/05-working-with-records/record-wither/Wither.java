//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 5 - Working with Records
//

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
        
        Point source = new Point(23, 42);
        System.out.println("source = " + source);
        
        Point modified = source.withX(5);
        System.out.println("modified = " + modified);
    }
}
