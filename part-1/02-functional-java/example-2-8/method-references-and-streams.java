//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 2 - Functional Java
//
// Example 2-8. Method references and Streams
//
// FOR JSHELL USE YOU HAVE TO COPY THE CODE MANUALLY,
// AS THE LINE BREAK CONFUSE JSHELL IF PIPED.
//

// A simplistic Customer type so the code compiles
class Customer {
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