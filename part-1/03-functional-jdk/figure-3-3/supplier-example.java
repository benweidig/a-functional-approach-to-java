//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 3 - Functional JDK
//
// Figure 3-3. java.util.function.Supplier<T>
//

Supplier<Double> random = () -> Math.random();

Double result = random.get();
