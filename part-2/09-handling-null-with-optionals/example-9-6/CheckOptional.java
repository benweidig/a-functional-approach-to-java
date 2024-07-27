//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 9 - Handling null with Optionals
//
// Example 9-6. Checking for Optional values
//

import java.util.Optional;

public class CheckOptional {

    public static void main(String[] args) {

        Optional<String> maybeValue = Optional.ofNullable(null);

        // VERBOSE VERSION
        if (maybeValue.isPresent()) {
            var value = maybeValue.orElseThrow();
            System.out.println(value);
        } else {
            System.out.println("No value found!");
        }
        
        // CONCISE VERSION
        maybeValue.ifPresentOrElse(System.out::println,
                                   () -> System.out.println("No value found!"));
    }
}
