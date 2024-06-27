package Heap;
import java.util.*;


/*
1. When you add integers from 1 to 5 from smallest to biggest to max-heap,
 it'll result to array [5,4,2,1,3]. What array results when you add integers 
 from 10 to 1 one at a time? How it differs if you convert [10,9,8,7,6,5,4,3,2,1] to maximum heap?

 */


public class Q1 {
    public static void main(String[] args) {
        // I created a priority queue (which is a max-heap by default)
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        // Here I added integers from 10 to 1 from biggest to smallest
        queue.add(10);
        queue.add(9);
        queue.add(8);
        queue.add(7);
        queue.add(6);
        queue.add(5);
        queue.add(4);
        queue.add(3);
        queue.add(2);
        queue.add(1);

        // Convert max heap to array and print
        Integer[] array = queue.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));
    }
}



/*
 // Explainations

    Initially, the max-heap is empty.
    If we Add 10 to the heap. The heap becomes: [10].
    If we Add 9 to the heap. The heap becomes: [10, 9].
    If we Add 8 to the heap. The heap becomes: [10, 9, 8].
    If we Add 7 to the heap. The heap becomes: [10, 9, 8, 7].
    If we Add 6 to the heap. The heap becomes: [10, 9, 8, 7, 6].
    If we Add 5 to the heap. The heap becomes: [10, 9, 8, 7, 6, 5].
    If we Add 4 to the heap. The heap becomes: [10, 9, 8, 7, 6, 5, 4].
    If we Add 3 to the heap. The heap becomes: [10, 9, 8, 7, 6, 5, 4, 3].
    If we Add 2 to the heap. The heap becomes: [10, 9, 8, 7, 6, 5, 4, 3, 2].
    If we Add 1 to the heap. The heap becomes: [10, 9, 8, 7, 6, 5, 4, 3, 2, 1].

// we can convert [10, 9, 8, 7, 6, 5, 4, 3, 2, 1] to a maximum heap using PriorityQueue this way also

PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        // integer reverse order from 10 to 1
        for (int i = 10; i >= 1; i--) {
            queue.add(i);
        }

        // Convert max heap to array and print
        Integer[] array = queue.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));







// Also I tested Smallest number 1 to 5

        // Here I added integers from 1 to 5 from smallest to biggest in a order
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        and output result was [5, 4, 2, 1, 3]

 */
