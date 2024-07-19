//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 5 - Working with Records
//

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class PointSerialization {

    record Point(int x, int y) implements Serializable {
        // EVOLUTION 1
        // record Point(int x, int y, int z) implements Serializable {

        // EVOLUTION 2
        // record Point(int z, int y, int x) implements Serializable {
    }

    public static void main(String... args) throws ClassNotFoundException, IOException {

        // Comment var point and try block to run "EVOLUTION 1" and "EVOLUTION 2"
        var point = new Point(23, 42);
        try (var out = new ObjectOutputStream(new FileOutputStream("point.data"))) {
            out.writeObject(point);
        }

        // EVOLUTION 1 / EVOLUTION 2
        // var in = new ObjectInputStream(new FileInputStream("point.data"));
        // var point = in.readObject();
        // System.out.println(point);
    }
}