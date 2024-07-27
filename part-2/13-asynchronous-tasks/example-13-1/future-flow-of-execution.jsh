//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 13 - Asynchronous Tasks
//
// Example 13-1. Future<T> flow of execution
//

import java.util.concurrent.Callable
import java.util.concurrent.ExecutionException
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

var executor = Executors.newFixedThreadPool(10)

Callable<Integer> expensiveTask = () -> {

    System.out.println("(task) start");

    TimeUnit.SECONDS.sleep(2);

    System.out.println("(task) done");

    return 42;
};

System.out.println("(main) before submitting the task")

var future = executor.submit(expensiveTask)

System.out.println("(main) after submitting the task")

var theAnswer = future.get()
System.out.println("theAnswer = " + theAnswer)

System.out.println("(main) after the blocking call future.get()")

executor.shutdown()
