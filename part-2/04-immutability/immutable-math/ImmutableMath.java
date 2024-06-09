import java.math.BigDecimal;

/**
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 4 - Immutabilty
 *
 * The State of Java Immtuability
 * > Immutable Collections
 */
public class ImmutableMath {

    public static void main(String[] args) {

        BigDecimal theAnswer = new BigDecimal(42);

        BigDecimal result = theAnswer.add(BigDecimal.ONE);

        System.out.println(result);
        System.out.println(theAnswer);
    }
}
