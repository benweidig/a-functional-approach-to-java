//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 7 - Working With Streams
//
// Example 7-2. Walking the Filesystem
//

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Predicate;

public class FilesWalking {

    public static void main(String[] args) {

        // ADAPT AS NECESARY
        var start = Paths.get("../04-immutability");

        try (var stream = Files.walk(start)) {
            stream.map(Path::toFile)
                  .filter(Predicate.not(File::isFile))
                  .sorted()
                  .forEach(System.out::println);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
