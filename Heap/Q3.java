/*
3. Use course materials or internet to find and explaine out how heap is used to find k largest or smallest elements. This is an essay task.


//answer:

K Largest Elements:

    To find the k largest elements in an array, we can use a max heap (priority queue). Here’s how it works:
        1. Create an empty max heap.
        2. Add the first k elements from the array to the max heap.
        3. For each remaining element in the array (from index k onwards):
            If the element is greater than the root of the max heap, replace the root with the current element.
        4. After processing all elements, the max heap contains the k largest elements.
        5. Extract elements from the max heap to get the final result.
    Time Complexity: O(n log k) (where n is the total number of elements in the array).



If K Smallest Elements:

    To find the k smallest elements in an array, we can use a min heap (priority queue). Here’s how it works:
        1. Create an empty min heap.
        2. Add the first k elements from the array to the min heap.
        3. For each remaining element in the array (from index k onwards):
            If the element is smaller than the root of the min heap, replace the root with the current element.
        4. After processing all elements, the min heap contains the k smallest elements.
        5. Extract elements from the min heap to get the final result.
    Time Complexity: O(n log k) (where n is the total number of elements in the array).





 */
