/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 10 - Functional Exception Handling
 */

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

// THIS CODE WON'T COMPILE
// Error:
// incompatible thrown types java.io.IOException in functional expression

Stream.of(Paths.get("try-catch.java"), Paths.get("files-readstring.java"))
      .map(Files::readString)
      .toList()
