//
// A FUNCTIONAL APPROACH TO JAVA
// Chapter 12 - Recursion
//
// Example 12-4. Iterative tree traversal
//

import java.util.Stack;

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

void traverseIterative(Node<String> root) {
    var tmpNodes = new Stack<Node<String>>();
    var current = root;

    while(!tmpNodes.isEmpty() || current != null) {

        if (current != null) {
            tmpNodes.push(current);
            current = current.left();
            continue;
        }

        current = tmpNodes.pop();

        System.out.print(current.value());

        current = current.right();
    }
}

traverseIterative(root);
