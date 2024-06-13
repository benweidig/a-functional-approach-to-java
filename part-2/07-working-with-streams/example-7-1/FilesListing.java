//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 7 - Working With Streams
//
// Example 7-1. Listing directories in a folder
//

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Predicate;

public class FilesListing {

    public static void main(String... args) {

        // ADAPT AS NECESARY
        var dir = Paths.get("../../../part-2/04-immutability");

        try (var stream = Files.list(dir)) {
            stream.map(Path::toFile)
                  .filter(Predicate.not(File::isFile))
                  .map(File::getName)
                  .forEach(System.out::println);
        } catch (IOException e) {
            // ...
        }
    }
}
