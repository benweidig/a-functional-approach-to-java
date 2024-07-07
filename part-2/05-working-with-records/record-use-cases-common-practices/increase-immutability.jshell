import java.util.Collections;
import java.util.List;

//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 5 - Working with Records
//

record IncreaseImmutability(List<String> values) {

    IncreaseImmutability {
        values = Collections.unmodifiableList(values);
    }
}
