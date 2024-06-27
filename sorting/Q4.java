/*
4. Use internet, AI or any other source to find information about bucket sort and explain how it works by sorting array [1,2,1,2,3,4,3,4,5]


 */

// ANSWER


/*

Bucket sort is a sorting algorithm that works by distributing the elements of an array
into a number of buckets, sorting each bucket, and then concatenating the sorted buckets
to form the final sorted array. It is a comparison sort algorithm, but it has a time complexity
of O(n + k), where n is the size of the input array and k is the number of buckets.

Bucket sort works well when the input array has a uniform distribution of elements,
as this allows for efficient distribution of elements into the buckets.

We can apply the bucket sort algorithm to sort the array [1,2,1,2,3,4,3,4,5]:



1. The first step in bucket sort is to determine the range of the input array and the
number of buckets to use. In this case, the range of the array is from 1 to 5, and we will use 5 buckets.



2. We create 5 empty buckets, one for each possible value in the input array. The buckets are represented as lists:

Bucket 1: [] Bucket 2: [] Bucket 3: [] Bucket 4: [] Bucket 5: []



3. We distribute the elements of the input array into the buckets based on their values.
For example, the element 1 goes into Bucket 1, the element 2 goes into Bucket 2, and so on:

Bucket 1: [1, 1] Bucket 2: [2, 2] Bucket 3: [3, 3] Bucket 4: [4, 4] Bucket 5: [5]



4. We sort each bucket using a simple sorting algorithm, such as insertion sort or selection sort. In this case, we will use insertion sort:

Bucket 1: [1, 1] Bucket 2: [2, 2] Bucket 3: [3, 3] Bucket 4: [4, 4] Bucket 5: [5]




5. We concatenate the sorted buckets to form the final sorted array:

[1, 1, 2, 2, 3, 3, 4, 4, 5]



*/


//I got the idea, and some contents collected from following website.

//Reference:
//https://www.geeksforgeeks.org/bucket-sort-2/
//https://www.tutorialspoint.com/data_structures_algorithms/bucket_sort_algorithm.htm
//https://www.programiz.com/dsa/bucket-sort
//https://www.javatpoint.com/bucket-sort

