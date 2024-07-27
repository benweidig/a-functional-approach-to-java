//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 10 - Functional Exception Handling
//
// Example 10-4. Using Optional<String> instead of throwing an IOException
//

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;

Optional<String> safeReadString(Path path) {
    try {
        var content = Files.readString(path);
        return Optional.of(content);
    } catch (IOException e) {
        return Optional.empty();
    }
}
