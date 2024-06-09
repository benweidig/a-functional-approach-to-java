//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 4 - Immutabilty
//
// The State of Java Immutability
// > Immutable Collections
//

List<String> modifiable = new ArrayList<>();
modifiable.add("blue");
modifiable.add("red");

List<String> unmodifiable = Collections.unmodifiableList(modifiable);
unmodifiable.clear();

// Exception java.lang.UnsupportedOperationException
//       at Collections$UnmodifiableCollection.clear (Collections.java:1086)
//       at (#5:1)
