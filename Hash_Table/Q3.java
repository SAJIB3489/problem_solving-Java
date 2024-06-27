package Hash_Table;
import java.util.Arrays;
import java.util.HashSet;

/*
3. Create two algorithms about how to count how many different integers there 
are in integer array size n. Other has to based on HashSet and other you can choose freely. 
Compare their time effectiveness and submit your results in comments. 
Test with arrays of size 1000, 100000 and 1000000. Use random to add integers to array.

 */


// I wrote 2 Algorithm inside this code. I used Hashset method and Sorting based method.

public class Q3 {
    // HashSet-based Approach
    public static int hashSetCount(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : array) {
            set.add(num);
        }
        return set.size();
    }

    // Sorting-based Approach
    public static int sortingCount(int[] array) {
        Arrays.sort(array);
        int count = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                count++;
            }
        }
        return count;
    }

    // Main method for testing
    public static void main(String[] args) {

        int[] array1 = RandomArray(1000000); // Here is the arrays of sizes, it can be different

        // HashSet-based Approach
        long startTime = System.nanoTime();
        System.out.println("HashSet Count for size 1000000: " + hashSetCount(array1));
        long endTime = System.nanoTime();
        System.out.println("Time taken: " + (endTime - startTime) + " nanoseconds");

        // Sorting-based Approach
        startTime = System.nanoTime();
        System.out.println("Sorting Count for size 1000000: " + sortingCount(array1));
        endTime = System.nanoTime();
        System.out.println("Time taken: " + (endTime - startTime) + " nanoseconds");

    }

    private static int[] RandomArray(int size) { // Here, I Used the Helper method to generate a random integer array
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * size);
        }
        return array;
    }
}

/*

// Result

Arrays of the size 1000:

HashSet Count for size 1000: 612
Time taken: 11014149 nanoseconds
Sorting Count for size 1000: 612
Time taken: 2429942 nanoseconds



Arrays of the size 100000:

HashSet Count for size 100000: 63140
Time taken: 63159550 nanoseconds
Sorting Count for size 100000: 63140
Time taken: 53027159 nanoseconds



Arrays of the size 1000000:

HashSet Count for size 1000000: 632165
Time taken: 284163824 nanoseconds
Sorting Count for size 1000000: 632165
Time taken: 264780799 nanoseconds


I debug the algorithms with arrays of sizes 1000, 100000, and 1000000,
filled with random integers and measure the execution time for each case
and compared their effectiveness.
 */




// Got the idea from following website
//https://learn.microsoft.com/en-us/dotnet/api/system.collections.generic.hashset-1.count?view=net-8.0
//https://www.geeksforgeeks.org/count-distinct-elements-in-an-array/
