//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 2 - Functional Java
//
// Example 2-9. Memoization with Map#computeIfAbsent
//

import java.util.HashMap
import java.util.Map
import java.util.function.Supplier

Map<String, Object> CACHE = new HashMap<>();

Integer expensiveCall(String arg0, int arg1) {
    try {
        System.out.println("Sleeping for 3 secs");
        Thread.sleep(3_000);
    }
    catch (InterruptedException e) {
        // ...
    }

    return arg1;
}

<T> T memoize(String identifier, Supplier<T> fn) {
    return (T) CACHE.computeIfAbsent(identifier, key -> fn.get());
}

Integer memoizedCall(String arg0, int arg1) {
    var compoundKey = String.format("expensiveCall:%s-%d", arg0, arg1);
    return memoize(compoundKey, () -> expensiveCall(arg0, arg1));
}

System.out.println("before first call")
var calculated = memoizedCall("hello, world!", 42)
System.out.println("after first call")

System.out.println("before second call")
var memoized = memoizedCall("hello, world!", 42)
System.out.println("after second call")
