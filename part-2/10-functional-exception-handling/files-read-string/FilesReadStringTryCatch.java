//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 10 - Functional Exception Handling
//

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FilesReadStringTryCatch {

    public static void main(String... args) {

        // THIS CODE WON'T COMPILE
        // Error:
        // Unhandled exception type IOException

        Stream.of(Paths.get("FilesReadstring.java"),
                  Paths.get("FilesReadStringTryCatch.java"))
              .map(path -> {
                try {
                    return Files.readString(path);
                } catch (IOException e) {
                    return null;
                }
              })
              .toList();
    }
}
