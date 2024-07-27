//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 9 - Handling null with Optionals
//
// Example 9-4. Loading content without Optionals
//

import java.util.HashMap;
import java.util.Map;

public class LoadingContentWithoutOptionals {

    record Content(String identifier,
                   boolean isPublished) { }

    static final Map<String, Content> cache = new HashMap<>();

    static Content loadFromDB(String identifier) {
        return new Content(identifier, true);
    }

    static Content get(String contentId) {

        if (contentId == null) {
            return null;
        }

        if (contentId.isBlank()) {
            return null;
        }

        var cacheKey = contentId.toLowerCase();

        var content = cache.get(cacheKey);
        if (content == null) {
            content = loadFromDB(contentId);
        }

        if (content == null) {
            return null;
        }

        if (!content.isPublished()) {
            return null;
        }

        return content;
    }

    public static void main(String... args) {

        var content = get("ABC");
        System.out.println("content = " + content);
    }
}
