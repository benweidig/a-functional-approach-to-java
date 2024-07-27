//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 4 - Immutabilty
//
// The State of Java Immutability
// > Immutable Collections
//

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExceptionThrown {

    public static void main(String[] args) {
        List<String> modifiable = new ArrayList<>();
        modifiable.add("blue");
        modifiable.add("red");

        List<String> unmodifiable = Collections.unmodifiableList(modifiable);

        unmodifiable.clear();
        // Exception in thread "main" java.lang.UnsupportedOperationException
	    //     at java.base/java.util.Collections$UnmodifiableCollection.clear(Collections.java:1086)
        //     at UnmodifiableListException.main(UnmodifiableListException.java:23)
    }
}
