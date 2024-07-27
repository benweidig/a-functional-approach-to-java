//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 14 - Design Patterns
//

public class Main {
    public static void main(String[] args) {
        var triangle = ShapeFactory.newShape(ShapeType.TRIANGLE, Color.RED);

        System.out.println(triangle);
    }
}