/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 5 - Working with Records
 */

public record Container<T>(T content,
                           String identifier) {
}

Container<String> stringContainer = new Container<>("hello, String!",
                                                    "a String container");

String content = stringContainer.content();
