//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 3 - Functional JDK
//
// Figure 3-2. java.util.function.Consumer<T>
//

Consumer<String> println = str -> System.out.println(str);

println.accept("Hello, Consumer!");
