/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 2 - Functional Java
 *
 * As this example is supposed to illustrate type inference
 * of ad-hoc created lambdas, the actual implementation
 * of filter1 and filter2 doesn't matter and is a placeholder
 * so the code compiles.
 */

interface LikePredicate<T> {

    boolean test(T value);
}


List<String> filter1(List<String> values,
                     Predicate<String> predicate) {
    return values;
}


List<String> filter2(List<String> values,
                     LikePredicate<String> predicate) {
    return values;
}


var values = Arrays.asList("a", null, "c");

var result1 = filter1(values, $ -> $ != null);
var result2 = filter2(values, $ -> $ != null);
