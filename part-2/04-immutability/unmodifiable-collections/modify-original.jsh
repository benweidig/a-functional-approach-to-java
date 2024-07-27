//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 4 - Immutabilty
//
// The State of Java Immutability
// > Immutable Collections
//

import java.util.ArrayList
import java.util.Collections
import java.util.List


List<String> original = new ArrayList<>()
original.add("blue")
original.add("red")

List<String> unmodifiable = Collections.unmodifiableList(original)

original.add("green")

System.out.println("unmodifiable = " + unmodifiable.size())
