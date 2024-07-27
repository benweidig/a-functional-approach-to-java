//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 14 - Design Patterns
//

public class Main {

    public static void main(String... args) {

        var builder = User.builder()
                          .email("john@doe")
                          .name("John Doe");

        // DO SOMETHING ELSE, PASS BUILDER ALONG

        var user = builder.addPermission("create")
                          .addPermission("edit")
                          .build();

        System.out.println(user);
    }
}
