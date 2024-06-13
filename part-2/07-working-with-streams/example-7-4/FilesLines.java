//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 7 - Working With Streams
//
// Example 7-4. Counting words in “War and Peace”
//

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilesLines {

    public static void main(String... args) {

        var location = Paths.get("war-and-peace.txt");

        // CLEANUP PATTERNS
        var punctionaction = Pattern.compile("\\p{Punct}");
        var whitespace = Pattern.compile("\\s+");
        var words = Pattern.compile("\\w+");

        Map<String, Integer> wordCount = null;

        try (Stream<String> stream = Files.lines(location)) {
            wordCount =
                // CLEAN CONTENT
                stream.map(punctionaction::matcher)
                      .map(matcher -> matcher.replaceAll(""))

                      // SPLIT TO WORDS
                      .map(whitespace::split)
                      .flatMap(Arrays::stream)

                      // ADDITIONAL CLEANUP
                      .filter(word -> words.matcher(word).matches())

                      // NORMALIZE
                      .map(String::toLowerCase)

                      // COUNTING
                      .collect(Collectors.toMap(Function.identity(),
                               word -> 1,
                               Integer::sum));
        } catch (IOException e) {
            // ...
        }

        System.out.println(wordCount);
    }
}
