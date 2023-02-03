/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 3 - Functional JDK
 */

Supplier<Double> random = () -> Math.random();

Double result = random.get();
