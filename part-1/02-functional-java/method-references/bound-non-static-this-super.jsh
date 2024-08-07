//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 2 - Functional Java
//
// Bound non-static method references this/super
//

import java.time.LocalDate
import java.util.function.Function
import java.util.function.Predicate


class SuperClass {

    String doWork(String input) {
        return "super: " + input;
    }
}


class SubClass extends SuperClass {

    @Override
    String doWork(String input) {
        return "this: " + input;
    }

    void superAndThis(String input) {

        Function<String, String> thisWorker = this::doWork;
        var thisResult = thisWorker.apply(input);
        System.out.println(thisResult);

        Function<String, String> superWorker = SubClass.super::doWork;
        var superResult = superWorker.apply(input);
        System.out.println(superResult);
    }
}

new SubClass().superAndThis("hello, World!")
