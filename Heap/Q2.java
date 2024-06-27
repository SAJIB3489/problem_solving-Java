package Heap;
import java.util.*;

/*

2. Create a class median-heap that contains numbers. Median-heaps root node always contains the 
median value of numbers after adding the new number. Class has following methods:
- add(int x) // adds x to list
- median() // returns the median of numbers(=value of root)

You can use Javas PriorityQueue here if you want.

 */



public class Q2 {
    public static void main(String[] args) {
        MedianHeap medianHeap = new MedianHeap();
        medianHeap.add(5);
        medianHeap.add(3);
        medianHeap.add(7);
        System.out.println("Median: " + medianHeap.median());
    }
}

class MedianHeap {
    private PriorityQueue<Integer> minHeap;
    private PriorityQueue<Integer> maxHeap;
    public MedianHeap() {
        minHeap = new PriorityQueue<>(); // Minimum heap
        maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // Maximum-heap
    }

    public void add(int x) {
        if (minHeap.isEmpty() || x >= minHeap.peek()) {
            minHeap.add(x);
        } else {
            maxHeap.add(x);
        }
        rebalanceHeaps();
    }

    public double median() {
        if (minHeap.size() == maxHeap.size()) {
            return (minHeap.peek() + maxHeap.peek()) / 2.0;
        } else {
            return minHeap.peek();
        }
    }

    private void rebalanceHeaps() {
        if (Math.abs(minHeap.size() - maxHeap.size()) > 1) {
            if (minHeap.size() > maxHeap.size()) {
                maxHeap.add(minHeap.poll());
            } else {
                minHeap.add(maxHeap.poll());
            }
        }
    }
}


// got the idea from
// https://www.geeksforgeeks.org/max-heap-in-java/