/*

4. We want to count the sum of first k smallest numbers of array size n. We have at least three options to do this:

- O(nk): we fetch the next smallest number k times 
- O(n log n): we sort the array and fetch k smallest numbers
- O(n + k log n): convert an array to minimum heap and remove the smallest number k times 

Effectiveness depends on the size of k. Compare these methods with different sizes of arrays and different values of k.

 */


// ANSWER:

/*

Firstly, I describe all the methods that you mentioned:

1. O(nk):

    In this approach, we repeatedly fetch the smallest number k times.
    This method is straightforward but inefficient, especially when k is large.
    Time Complexity: O(nk) (linear scan for each of the k elements).


2. O(n log n) (Sorting Approach):

    Sort the entire array using a sorting algorithm (e.g., quicksort, mergesort, heapsort).
    Sum the first k elements from the sorted array.
    This method works well when k is relatively small compared to n.
    Time Complexity: O(n log n) (sorting the entire array).

3. O(n + k log n) (Min-Heap Approach):

    Convert the array into a minimum heap (min-heap) using a priority queue.
    Extract the smallest element from the heap k times.
    This method is efficient when k is small or comparable to n.
    Time Complexity: O(n + k log n) (building the heap and extracting k elements).


we can compare using different size of array


    If k is very small (constant factor), the O(n + k log n) approach is preferable because it efficiently finds the k smallest elements.
    If k is comparable to n, the O(n log n) sorting approach may be more efficient.
    The O(nk) approach is generally inefficient and not recommended.




// Collected from : https://www.geeksforgeeks.org/number-of-k-length-subsequences-with-minimum-sum/
 */