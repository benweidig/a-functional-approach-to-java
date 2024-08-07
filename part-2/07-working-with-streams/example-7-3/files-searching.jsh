//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 7 - Working With Streams
//
// Example 7-3. Finding Folders
//

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;

var start = Paths.get("../04-immutability");

BiPredicate<Path, BasicFileAttributes> matcher =
    (path, attr) -> attr.isDirectory();

try (var stream = Files.find(start, Integer.MAX_VALUE, matcher)) {
    stream.sorted()
          .forEach(System.out::println);
} catch (IOException e) {
    System.err.println(e);
}