/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 7 - Working With Streams
 *
 * Example 7-1. Listing a directory
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

var start = Paths.get("./part-1");

try (var stream = Files.list(Paths.get("."))) {
    stream.map(Path::toFile)
          .filter(Predicate.not(File::isFile))
          .sorted()
          .forEach(System.out::println);} catch (IOException e) {
    // ...
}
