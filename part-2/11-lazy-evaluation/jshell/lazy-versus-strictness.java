/*
 * A FUNCTIONAL APPROACH TO JAVA
 * Chapter 11 - Lazy Evaluation
 *
 * Example 11-1. Lazy Evaluation with Java and Suppliers
 */

import java.util.function.IntSupplier;

int addStrict(int x, int y) {
    return x + x;
}

int addLazy(IntSupplier x, IntSupplier y) {
    return x.getAsInt() + x.getAsInt();
}

void strict() {
    addStrict(5, 1 / 0);
}

void lazy() {
    int result = addLazy(() -> 5, () -> 1 / 0);
    System.out.println(result);
}

// strict();
// lazy();
