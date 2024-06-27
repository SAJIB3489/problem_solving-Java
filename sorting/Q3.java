/*
3. Explain how binary search algorithm finds 3 from sorted array [1,2,2,3,4,4,5,6,6,7,8,8,9]. Explain step-by-step. 

 */


// answer

/*


We can apply the binary search algorithm to find the number 3 in the sorted array [1,2,2,3,4,4,5,6,6,7,8,8,9]:
Here, are the steps:-

1. The first step in binary search is to find the middle element of the array. In this case,
the array has 13 elements, so the middle element is at index 6 (since arrays are 0-indexed). The middle element is 4.

2. We compare the middle element (4) with the target value (3).
Since 3 is less than 4, we know that if the target value exists in the array, it must be in the left half of the array.

3. Now, we repeat the process with the left half of the array,
which consists of the elements [1,2,2,3]. The middle element of this subarray is at index 2, which is 2.

4. We compare the middle element (2) with the target value (3).
Since 3 is greater than 2, we know that if the target value exists in the array, it must be in the right half of the current subarray.

5. Now, We repeat the process with the right half of the current subarray,
which consists of the elements [3]. The middle element of this subarray is 3.

6. We compare the middle element (3) with the target value (3).
Since they are equal, we have found the target value in the array.


 //Throughout this process, we can reduce the size of the search interval by half at each step.
 This is what makes binary search such an efficient algorithm for searching in sorted arrays.

*/


//I got the idea from following website.

//Reference:
//https://www.geeksforgeeks.org/print-distinct-elements-given-integer-array/
