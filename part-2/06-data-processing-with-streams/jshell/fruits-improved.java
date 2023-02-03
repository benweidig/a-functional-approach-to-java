/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 6 - Data Processing with Streams
 *
 * Example 6-15. Fruit pipeline (improved)
 */

Stream.of("ananas", "oranges", "apple", "pear", "banana")
      .filter(s -> s.startsWith("a")) 
      .map(String::toUpperCase) 
      .sorted() 
      .forEach(System.out::println);
