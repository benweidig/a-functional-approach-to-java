//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 9 - Handling null with Optionals
//
// Example 9-5. Loading content with an Optional call chain
//

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;

public class CallChain {

    record Content(String identifier,
                   boolean isPublished) {
    }

    static final Map<String, Content> cache = new HashMap<>();

    static Optional<Content> loadFromDB(String identifier) {
        return Optional.of(new Content(identifier, true));
    }

    static Optional<Content> get(String contentId) {
        return Optional.ofNullable(contentId) 
                       .filter(Predicate.not(String::isBlank)) 
                       .map(String::toLowerCase) 
                       .map(cache::get)
                       .or(() -> loadFromDB(contentId)) 
                       .filter(Content::isPublished); 
    }

    public static void main(String[] args) {

        var content = get("ABC");
        System.out.println("content = " + content);
    }
}

