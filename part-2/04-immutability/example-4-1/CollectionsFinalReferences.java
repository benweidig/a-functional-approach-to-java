import java.util.ArrayList;
import java.util.List;

/**
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 4 - Immutabilty
 * 
 * Example 4-1. Collections final references
 */
 public class CollectionsFinalReferences {
 
     public static void main(String... args) {
         final List<String> fruits = new ArrayList<>();
 
         System.out.println(fruits.isEmpty());
 
         fruits.add("Apple");
 
         System.out.println(fruits.isEmpty());
 
         // WON'T COMPILE:
         // fruits = List.of("Mango", "Melon");
         //
         // ERROR
         // The final local variable fruits cannot be assigned.
         // It must be blank and not using a compound assignment
     }
 }
 