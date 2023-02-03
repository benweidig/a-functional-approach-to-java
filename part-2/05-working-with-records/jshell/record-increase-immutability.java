/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 5 - Working with Records
 */

import java.util.Collections;
import java.util.List;

public record IncreaseImmutability(List<String> values) {

    public IncreaseImmutability {
        values = Collections.unmodifiableList(values);
    }
}
