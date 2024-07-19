//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 5 - Working with Records
//

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class IncreaseImmutability {

    record Container(List<String> values) {

        public Container {
            values = Collections.unmodifiableList(values);
        }
    }

    public static void main(String... args) {
        
        List<String> mutableList = new ArrayList<>();
        mutableList.add("first item");

        var container = new Container(mutableList);


        container.values().add("second items");
        // throws UnsupportedOperationException
    }
}
