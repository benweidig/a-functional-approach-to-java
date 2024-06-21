//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 10 - Functional Exception Handling
//
// Example 10-1. Extract throwing code into a safe method
//

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.util.Objects;

public class SafeMethodExtraction {

    static String safeReadString(Path path) {
        try {
            return Files.readString(path);
        } catch (IOException e) {
            return null;
        }
    }

    public static void main(String... args) {
        var result = Stream.of(Paths.get("SafeMethodExtraction.java"),
                               Paths.get("safe-method-extraction.java"))
                           .map(SafeMethodExtraction::safeReadString)
                           .filter(Objects::nonNull)
                           .count();

        System.out.println("Found: " + result);
    }
}
