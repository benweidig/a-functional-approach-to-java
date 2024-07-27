//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 4 - Immutabilty
//
// The State of Java Immtuability
// > Immutable Collections
//

import java.math.BigDecimal;

public class ImmutableMath {

    public static void main(String[] args) {

        BigDecimal theAnswer = new BigDecimal(42);

        BigDecimal result = theAnswer.add(BigDecimal.ONE);

        System.out.println("result = " + result);
        System.out.println("theAnswer = " + theAnswer);
    }
}
