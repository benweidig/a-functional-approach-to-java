//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 10 - Functional Exception Handling
///

 import java.io.IOException;
 import java.nio.file.Files;
 import java.nio.file.Path;
 import java.nio.file.Paths;
 import java.util.stream.Stream;
 
 public class SneakyThrows {
 
     static <E extends Throwable> void sneakyThrow(Throwable e) throws E {
         throw (E) e;
     }
 
     static String sneakyRead(Path path) {
         try {
             return Files.readString(path);
         }
         catch (IOException e) {
             sneakyThrow(e);
         }
 
         // This code is never reached
         return null;
     }
 
     public static void main(String... args) {
         var result = Stream.of(Paths.get("invalid file"))
                            .map(SneakyThrows::sneakyRead)
                            .toList();
         System.out.println("files count = " + result);
     }
 }
 