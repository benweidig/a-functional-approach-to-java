//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 5 - Working with Records
//

record Point(int x, int y) {
    // NO BODY
}

var point = new Point(23, 42);

if (point instanceof Point(int x, int y)) {
    System.out.println("point x+y = " + (x + y));
    // => 65
}

record Point3D(int x, int y, int z) {
    // NO BODY
}

Object anyObject = new Point3D(1, 2, 3)

int result = switch (anyObject) {
    case Point(var x, var y) -> x + y;
    case Point3D(var x, var y, var z) -> x + y + z;
    default -> 0;
}

System.out.println("result = " + result)
