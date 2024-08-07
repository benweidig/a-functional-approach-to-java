//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 2 - Functional Java
//
// Example 2-6. Anonymous class versus lambda expression
//

public class HelloWorldLambda {

    public static void main(String... args) {

        HelloWorld helloWorld = name -> "hello, " + name + "!";

        var greeting = helloWorld.sayHello("Ben");
        System.out.println(greeting);
    }
}
