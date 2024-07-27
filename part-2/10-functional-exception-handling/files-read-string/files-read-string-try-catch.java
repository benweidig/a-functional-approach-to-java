//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 10 - Functional Exception Handling
//

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

Stream.of(Paths.get("files-read-string.java"),
          Paths.get("files-read-string-try-catch.java"))
      .map(path -> {
          try {
              return Files.readString(path);
          } catch (IOException e) {
              return null;
          }
      })
      .toList()
