# A Functional Approach to Java

This is the accompanying repository for the O'Reilly book [A Functional Approach to Java](https://a-functional-approach-to-java.com).

<img src="assets/a-functional-approach-to-java.png" alt="Book Cover" height="400" width="305" title="Book Cover" />


## How To Use

The repository is structured like the book.

Each explicit example has its own directory containing code, usually Java and JShell files.

The actual implementation of the examples might differ from their counterparts in the book to make them easier to use.

Many examples are supposed to highlight how a specific code syntax is used and don't represent a full-fledged example with actual output.
Especially JShell scripts don't have explicit output, but the results are printed anyway.

Nevertheless, the examples should be helpful as a starting point to experiment.

### Java/Gradle

To not require a myriad of intermediate folders (`src/main/java` etc.), the examples are plain files with an adapted classpath.
This way, you can start sill start examples with Gradle.

All examples are grouped by chapters, see:

```shell
./gradlew tasks
```

The task name for each example is unique and runs without requiring the subproject:

```shell
# Actually runs :02-functional-java:example-2-9
./gradlew example-2-9
```


### JShell

Examples with lowercase-dash-separated names are JShell-compatible files.
They have the `.jsh` extension, so they do not clash with the `.java` files for Gradle.

The examples from the book can mostly be run directly in [JShell](https://belief-driven-design.com/jshell-the-java-repl-82d804e6cbf/):


```shell
jshell part-2/06-data-processing-with-streams/example-6-15/fruits-naive.jsh

# or

cd part-2/06-data-processing-with-streams/example-6-15/
jshell fruits-naive.jsh
```

Some code, however, demonstrates invalid code, throws Exceptions, or won't compile at all.
Other examples won't compile due to parsing rules of new lines.
I've tried to mark such examples with a comment in the header.



## Get the Book

Besides using the [O'Reilly Learning Platform](https://www.oreilly.com/library/view/a-functional-approach/9781098109912/), you can buy a paperback version of the book at your favorite store.
Here are a few direct links to US stores:

* [Amazon](https://www.amazon.com/-/de/dp/1098109929)
* [Barnes & Noble](https://www.barnesandnoble.com/w/a-functional-approach-to-java-ben-weidig/1141565109?ean=9781098109929)
* [Books Inc](https://www.booksinc.net/book/9781098109929)
* [Powell's Books](https://www.powells.com/book/functional-approach-to-java-augmenting-object-oriented-java-code-with-functional-principles-9781098109929)

ISBN-10: 1098109929  
ISBN-13: 9781098109929

The book is also available in Polish and Korean:

* [Helion.pl (Polish)](https://helion.pl/ksiazki/java-podejscie-funkcyjne-rozszerzanie-obiektowego-kodu-javy-o-zasady-programowania-funkcyjnego-ben-weidig,japofu.htm)
* [Kyobo (Korean)](https://product.kyobobook.co.kr/detail/S000212762854)
