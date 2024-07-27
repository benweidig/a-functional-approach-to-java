//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 5 - Working with Records
//

public class Generics {

    record Container<T>(T content, String identifier) { }

    public static void main(String[] args) {

        Container<String> stringContainer = new Container<>("hello, String!",
                                                            "a String container");

        System.out.println("content = " + stringContainer.content());
    }
}
