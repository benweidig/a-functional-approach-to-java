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

public class PointSerializationIdentical {

    record Point(int x, int y) implements Serializable {
    }

    record IdenticalPoint(int x, int y) implements Serializable {
    }

    public static void main(String... args) throws ClassNotFoundException, IOException {

        var point = new Point(23, 42);
        try (var out = new ObjectOutputStream(new FileOutputStream("point.data"))) {
            out.writeObject(point);
        }

        var in = new ObjectInputStream(new FileInputStream("point.data"));
        IdenticalPoint identicalPoint = in.readObject();
    }
}
