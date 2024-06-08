/**
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 2 - Functional Java
 * 
 * Example 2-6. Anonymous class versus lambda expression
 */

 // AS ANONYMOUS CLASS
public class HelloWorldAnonymous {

    public static void main(String... args) {

        var helloWorld = new HelloWorld() {

            @Override
            public String sayHello(String name) {
                return "hello, " + name + "!";
            }
        };
    }
}
