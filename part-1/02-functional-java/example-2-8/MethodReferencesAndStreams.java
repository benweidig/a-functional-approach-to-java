import java.util.List;

/**
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 2 - Functional Java
 * 
 * Example 2-8. Method references and Streams
 */

public class MethodReferencesAndStreams {

    // A simplistic Customer type so the code compiles
    static class Customer {
        private final String  name;
        private final boolean active;

        Customer(String name, boolean active) {
            this.name = name;
            this.active = active;
        }

        String getName() {
            return this.name;
        }

        boolean isActive() {
            return this.active;
        }
    }

    public static void main(String... args) {

        List<Customer> customers = List.of(
            new Customer("Ben Weidig", true),
            new Customer("John Doe", false)
        );

        // LAMBDAS

        String[] lambdas =
            customers.stream()
                     .filter(customer -> customer.isActive())
                     .map(customer -> customer.getName())
                     .map(name -> name.toUpperCase())
                     .peek(name -> System.out.println(name))
                     .toArray(count -> new String[count]);


        // METHOD-REFERENCES

        String[] methodsRefs =
            customers.stream()
                     .filter(Customer::isActive)
                     .map(Customer::getName)
                     .map(String::toUpperCase) 
                     .peek(System.out::println)
                     .toArray(String[]::new);
    }
}
