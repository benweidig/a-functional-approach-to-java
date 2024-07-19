//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 3 - Functional JDK
//
// Figure 3-3. java.util.function.Supplier<T>
//

import java.util.function.Supplier

Supplier<Double> random = () -> Math.random()

Double result = random.get()
System.out.println("random = " + result)
