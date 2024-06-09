import java.util.function.Supplier;

/**
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 3 - Functional JDK
 * 
 * Figure 3-3. java.util.function.Supplier<T>
 */
public class SupplierExample {

    public static void main(String[] args) {
        
        Supplier<Double> random = () -> Math.random();
        
        Double result = random.get();

        System.out.println(result);
    }
}
