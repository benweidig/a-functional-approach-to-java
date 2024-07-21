//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 7 - Working With Streams
//

import java.util.Arrays;

public class ObjectStreamToArray {

    public static void main(String[] args) {

        String[] fruits = new String[] {
            "Banana",
            "Melon",
            "Orange"
        };

        String[] result = Arrays.stream(fruits)
                                .filter(fruit -> fruit.contains("a"))
                                .toArray(String[]::new);

        for (var fruit : result) {
            System.out.println(fruit);
        }
    }
}
