//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 2 - Functional Java
//
// Example 2-6. Anonymous class vs. lambda expression
//

// FUNCTIONAL INTERFACE (implicit)

interface HelloWorld {
    String sayHello(String name);
}


// AS ANONYMOUS CLASS

var helloWorld = new HelloWorld() {

    @Override
    public String sayHello(String name) {
        return "hello, " + name + "!";
    }
};


// AS LAMBDA

HelloWorld helloWorldLambda = name -> "hello, " + name + "!";


// RUN

helloWorld.sayHello("Ben");
helloWorldLambda.sayHello("Ben");
