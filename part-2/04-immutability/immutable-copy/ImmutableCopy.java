import java.util.ArrayList;
import java.util.List;

/**
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 4 - Immutabilty
 *
 * The State of Java Immtuability
 * > Immutable Collections
 */
public class ImmutableCopy {

    public static void main(String[] args) {

        // SETUP ORIGINAL LIST
        List<String> original = new ArrayList<>();
        original.add("blue");
        original.add("red");

        // CREATE COPY
        List<String> copiedList = List.copyOf(original);

        // ADD NEW ITEM TO ORIGINAL LIST
        original.add("green");

        // CHECK CONTENT
        System.out.println(original);

        System.out.println(copiedList);
    }
}
