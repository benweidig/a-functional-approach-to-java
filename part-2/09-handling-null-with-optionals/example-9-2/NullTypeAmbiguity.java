//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 9 - Handling null with Optionals
//
// Example 9-2. null type ambiguity
//

public class NullTypeAmbiguity {

    static void methodAcceptingString(String str) {
        // ...
    }

    public static void main(String... args) {

        // "TYPE-LESS" NULL AS AN ARGUMENT

        methodAcceptingString(null);

        // ACCESSING A "TYPED" NULL

        String name = null;

        var lowerCaseName = name.toLowerCase();
        // => NullPointerException

        // TEST TYPE OF NULL

        var notString = name instanceof String;
        System.out.println("notString: " + notString);

        var stillNotString = (name) instanceof String;
        System.out.println("stillNotString: " + stillNotString);
    }
}
