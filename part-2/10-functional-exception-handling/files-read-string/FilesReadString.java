//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 10 - Functional Exception Handling
//

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FilesReadString {

    public static void main(String... args) {

        // THIS CODE WON'T COMPILE
        // Error:
        // Unhandled exception type IOException

        Stream.of(Paths.get("FilesReadstring.java"),
                  Paths.get("FilesReadStringTryCatch.java"))
              .map(Files::readString)
              .toList();
    }
}
