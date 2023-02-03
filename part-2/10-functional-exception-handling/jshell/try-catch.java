/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 10 - Functional Exception Handling
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.files.Paths;
import java.math.BigDecimal;

// ---------------------------------------------------------------------
// java.lang.ArithmeticException

BigDecimal doCalculation(BigDecimal input) {
    return BigDecimal.ONE.divide(input);
}

try {
    doCalculation(BigDecimal.ZERO);
} catch (ArithmeticException | IllegalArgumentException e) {
    System.err.println("Calculation failed: " + e);
}

// ---------------------------------------------------------------------

// java.io.FileNotFoundException

var path = Paths.get("invalid path");

try (var fileReader = new FileReader(path.toFile());
     var bufferedReader = new BufferedReader(fileReader)) {

    var firstLine = bufferedReader.readLine();
    System.err.println(firstLine);

} catch (IOException e) {
    System.err.println("Couldn't read first line of " + path + ": " + e);
}