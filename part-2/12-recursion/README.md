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

JShell script calculating 4! with head-recursion.

[`jshell/head-recursion.java`](jshell/head-recursion.java)

### Example 12-2. Calculating factorials with tail recursion

JShell script calculating 4! with tail-recursion.

[`jshell/tail-recursion.java`](jshell/tail-recursion.java)


## A More Complex Example

### Example 12-3. Tree node structure

JShell script of the shared Record / tree structure for the next two examples.

[`jshell/tree-node.java`](jshell/tree-node.java)


### Example 12-4. Iterative tree traversal

JShell script that iteratively traverses the tree.

[`jshell/tree-traversal-iterative.java`](jshell/tree-traversal-iterative.java)

## Recursion-like Streams

A short example of how to create a "recursion-like" Stream.

[`other/stream-recursion.md`](other/stream-recursion.md)
