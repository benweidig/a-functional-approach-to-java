//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 5 - Working with Records
//

import java.util.Collections;
import java.util.List;


record Container(List<String> values) {

    public Container {
        values = Collections.unmodifiableList(values);
    }
}

List<String> mutableList = new ArrayList<>()
mutableList.add("first item")

var container = new Container(mutableList)


container.values().add("second items")
// Exception java.lang.UnsupportedOperationException
//       at Collections$UnmodifiableCollection.add (Collections.java:1067)
//       at (#7:1)
