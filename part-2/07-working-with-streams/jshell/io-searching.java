/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 7 - Working With Streams
 *
 * Example 7-3. Finding Files
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;

var start = Paths.get("./part-1");

BiPredicate<Path, BasicFileAttributes> matcher =
    (path, attr) -> attr.isRegularFile();

try (var stream = Files.find(start, Integer.MAX_VALUE, matcher)) {
    stream.sorted().forEach(System.out::println);
} catch (IOException e) {
    // ...
}