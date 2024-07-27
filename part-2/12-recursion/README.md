# Chapter 12: Recursion

## What is Recursion?

### Equation 12-1. Formal representation of a factorial calculation

```math
\begin{equation}
\begin{aligned}
    & fac(n) \\
    \rightarrow& n * fac(n-1) \\
    \rightarrow& n * (n-1) * fac(n-2) \\
    \rightarrow& 4 * (n-1) * (n-2) * \dots * fac(1) \\
    \rightarrow& 4 * (n-1) * (n-2) * \dots * 1 \\
\end{aligned}
\end{equation}
```


### Example 12-1. Calculating factorials with head recursion

Calculating 4! with head-recursion.

[Example 12-1](example-12-1)

### Example 12-2. Calculating factorials with tail recursion

Calculating 4! with tail-recursion.

[Example 12-2](example-12-2)


## A More Complex Example

### Example 12-3. Tree node structure

The shared Record-based tree structure for the next two examples.

[Example 12-3](example-12-3)

### Example 12-4. Iterative tree traversal

Iteratively traverse the tree.

[Example 12-4](example-12-4)

### Example 12-5. Recursive tree traversal

Recursively traverse the tree.

[Example 12-5](example-12-5)

### Example 12-6. Extend Node<T> with traversal method

Let the Nodes traverse themselves.

[Example 12-6](example-12-6)


## Recursion-like Streams

A short example of how to create a "recursion-like" Stream.

[Stream recursion](stream-recursion/stream-recursion.md)
