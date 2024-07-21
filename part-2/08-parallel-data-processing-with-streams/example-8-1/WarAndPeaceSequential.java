//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 8 - Parallel Data Processing with Streams
//
// Example 8-1. Sequentially counting words in "War and Peace"
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

public class WarAndPeaceSequential {

    public static void main(String... args) {

        var location = Paths.get("other/war-and-peace.txt");

        // CLEANUP PATTERNS
        var punctionaction = Pattern.compile("\\p{Punct}");
        var whitespace = Pattern.compile("\\s+");
        var words = Pattern.compile("\\w+");

        Map<String, Integer> wordCount = null;

        try {
            // LOAD CONTENT
            var content = Files.readString(location);
            wordCount = Stream.of(content)
                    // CLEAN CONTENT
                    .map(punctionaction::matcher)
                    .map(matcher -> matcher.replaceAll(""))

                    // SPLIT TO WORDS
                    .map(whitespace::split)
                    .flatMap(Arrays::stream)
                    .filter(word -> words.matcher(word).matches())

                    // COUNTING
                    .map(String::toLowerCase)
                    .collect(Collectors.toMap(Function.identity(),
                             word -> 1,
                             Integer::sum));
        } catch (IOException e) {
            // ...
        }

        System.out.println("word count = " + wordCount);
    }
}
