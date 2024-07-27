//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 9 - Handling null with Optionals
//
// Example 9-4. Loading content without Optionals
//

import java.util.HashMap;
import java.util.Map;

record Content(String identifier,
               boolean isPublished) { }

Content loadFromDB(String identifier) {
    return new Content(identifier, true);
}

Map<String, Content> cache = new HashMap<>()

Content get(String contentId) {

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

var content = get("ABC")
System.out.println("content = " + content)