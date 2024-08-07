//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 2 - Functional Java
//

// Functional interface that an equivalent to java.util.Predicate<T>
interface LikePredicate<T> {

    boolean test(T value);
}


LikePredicate<String> isNull = $ -> $ == null;

// Assign isNull it to a functional interface with an identical SAM won't compile
Predicate<String> wontCompile = isNull;

// Error:
// incompatible types: LikePredicate<java.lang.String> cannot be converted
// to java.util.function.Predicate<java.lang.String>
// Predicate<String> wontCompile = isNull;
//                                 ^----^
