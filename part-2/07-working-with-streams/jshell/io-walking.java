/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 7 - Working With Streams
 *
 * Example 7-2. Walking the Filesystem
 */

import java.io.IOException;
import java.nio.file.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

var start = Paths.get("./part-1");

try (var stream = Files.walk(start)) {
    stream.map(Path::toFile)
          .filter(Predicate.not(File::isFile))
          .sorted()
          .forEach(System.out::println);
} catch (IOException e) {
  // ...
}
