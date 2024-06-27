
/*
  2.  How many different ways there are to form
       binary search trees for {1,...,10}?
       What do they look like?
       How many there are?
       What are their heights?

 */



/* ANSWER:
There are number of different ways to form binary search trees for {1, ..., 10}.
It might be depended on order of insertion.

Here is some example, how we can find the umber of BSTs and understand their heights:

1. Catalan Numbers:
The nth Catalan number, Cn, is the number of distinct Binary Search Trees (BSTs) with n distinct keys. Here, n equals 10.

2.Finding Cn:

For big n, there is no easy way to calculate Cn. There are, nevertheless, iterative and recursive methods. For a recursive definition, see this:

For k equal to 0 to n-1, Cn = sum(Ck-1 * C(n-k-1)).

This basically states that by selecting a root (k elements smaller) and attaching subtrees with the remaining
elements (n-k-1 elements), the number of BSTs with n elements can be formed.

Cn = 292 for n = 10.


3. Putting BSTs in perspective:

Drawing each of the 292 BSTs here would be unfeasible.
Nonetheless, the following examples of varying heights might help to clarify the idea:

A. Balanced BST (Height = 3):

    5
   / \
  3   7
 / \   \
1   4   8
       \
        9
         \
          10

B. Left-Skewed BST (Height = 9):

     10
      \
       9
        \
         8
          \
           7
            \
             6
              \
               5
                \
                 4
                  \
                   3
                    \
                     2
                      \
                       1

C. Right-Skewed BST (Height = 9):

     1
      \
       2
        \
         3
          \
           4
            \
             5
              \
               6
                \
                 7
                  \
                   8
                    \
                     9
                      \
                       10



BST height:

    The height of a balanced BST with n nodes will be roughly log2(n). The height in the
    first case, when n = 10, is 3, which is almost equal to log2(10) ≈ 3.32.
    At the worst situation, when the tree turns into a linked list, a skewed BST can have
    a height as big as n-1. This is seen by the skewed trees in instances 2 and 3,
    which have a height of 9 for n = 10.




 */