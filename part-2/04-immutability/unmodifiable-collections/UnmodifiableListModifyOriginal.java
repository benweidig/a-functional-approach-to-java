import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 4 - Immutabilty
 *
 * The State of Java Immutability
 * > Immutable Collections
 */
 public class UnmodifiableListModifyOriginal {

    public static void main(String[] args) {
        List<String> original = new ArrayList<>();
        original.add("blue");
        original.add("red");

        List<String> unmodifiable = Collections.unmodifiableList(original);

        original.add("green");

        int size = unmodifiable.size();
        System.out.println(size);
        // => 3
    }
}
