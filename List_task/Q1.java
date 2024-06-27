package List_task;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
1. Compare operations for Javas ArrayList and LinkedList. Measure times while doing multiple read, 
write and delete operations. Compare with 100, 500 and 1000 operations.

Submit code and your results in codes comments.

 */



public class Q1 {
    public static void main(String[] args) {
        int numOperations = 500;

        // Create an ArrayList
        List<Integer> arrayList = new ArrayList<>();
        // Create a LinkedList
        List<Integer> linkedList = new LinkedList<>();

        // Measure time for writing elements
        long startArrayListWrite = System.nanoTime();
        for (int i = 0; i < numOperations; i++) {
            arrayList.add(i);
        }
        long endArrayListWrite = System.nanoTime();

        long startLinkedListWrite = System.nanoTime();
        for (int i = 0; i < numOperations; i++) {
            linkedList.add(i);
        }
        long endLinkedListWrite = System.nanoTime();

        // Measure time for reading elements
        long startArrayListRead = System.nanoTime();
        for (int i = 0; i < numOperations; i++) {
            arrayList.get(i);
        }
        long endArrayListRead = System.nanoTime();

        long startLinkedListRead = System.nanoTime();
        for (int i = 0; i < numOperations; i++) {
            linkedList.get(i);
        }
        long endLinkedListRead = System.nanoTime();

        // Measure time for deleting elements
        long startArrayListDelete = System.nanoTime();
        for (int i = 0; i < numOperations; i++) {
            arrayList.remove(0);
        }
        long endArrayListDelete = System.nanoTime();

        long startLinkedListDelete = System.nanoTime();
        for (int i = 0; i < numOperations; i++) {
            linkedList.remove(0);
        }
        long endLinkedListDelete = System.nanoTime();

        // Calculate elapsed times
        long arrayListWriteTime = endArrayListWrite - startArrayListWrite;
        long linkedListWriteTime = endLinkedListWrite - startLinkedListWrite;
        long arrayListReadTime = endArrayListRead - startArrayListRead;
        long linkedListReadTime = endLinkedListRead - startLinkedListRead;
        long arrayListDeleteTime = endArrayListDelete - startArrayListDelete;
        long linkedListDeleteTime = endLinkedListDelete - startLinkedListDelete;

        // Print results
        System.out.println("ArrayList write time (ns): " + arrayListWriteTime);
        System.out.println("LinkedList write time (ns): " + linkedListWriteTime);
        System.out.println("ArrayList read time (ns): " + arrayListReadTime);
        System.out.println("LinkedList read time (ns): " + linkedListReadTime);
        System.out.println("ArrayList delete time (ns): " + arrayListDeleteTime);
        System.out.println("LinkedList delete time (ns): " + linkedListDeleteTime);
    }
}



/*
// Result for Operation 100
ArrayList write time (ns): 95335
LinkedList write time (ns): 182359
ArrayList read time (ns): 25772
LinkedList read time (ns): 66281
ArrayList delete time (ns): 114891
LinkedList delete time (ns): 48261

// Result for Operation 500
ArrayList write time (ns): 400618
LinkedList write time (ns): 731464
ArrayList read time (ns): 144644
LinkedList read time (ns): 692911
ArrayList delete time (ns): 231459
LinkedList delete time (ns): 202544

// Result for Operation 1000
ArrayList write time (ns): 858229
LinkedList write time (ns): 636827
ArrayList read time (ns): 243822
LinkedList read time (ns): 1566296
ArrayList delete time (ns): 512507
LinkedList delete time (ns): 855854

*/


//I followed that websites
// https://springframework.guru/java-arraylist-vs-linkedlist/
