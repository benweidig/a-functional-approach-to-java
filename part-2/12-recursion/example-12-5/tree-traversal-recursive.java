//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 12 - Recursion
//
// Example 12-5. Recursive tree traversal
//

// SETUP

record Node<T>(T value, Node<T> left, Node<T> right) {

    static <T> Node<T> of(T value, Node<T> left, Node<T> right) {
        return new Node<>(value, left, right);
    }

    static <T> Node<T> of(T value) {
        return new Node<>(value, null, null);
    }

    static <T> Node<T> left(T value, Node<T> left) {
        return new Node<>(value, left, null);
    }

    static <T> Node<T> right(T value, Node<T> right) {
        return new Node<>(value, null, right);
    }
}

var root = Node.of("1",
                   Node.of("2",
                           Node.of("4",
                                   Node.of("7"),
                                   Node.of("8")),
                           Node.of("5")),
                   Node.right("3",
                              Node.left("6",
                                        Node.of("9"))));

// RELEVANT CODE

void traverseRecursive(Node<String> node) {
    if (node == null) {
        return;
    }

    traverseRecursive(node.left());

    System.out.print(node.value());

    traverseRecursive(node.right());
}

traverseRecursive(root);
