package sorting;
import java.util.Arrays;

/*

1. Write quicksort algorithm yourself by using the idea of course materials. Compare it to Javas sorting algorithm speed with different sizes of arrays.

 */


public class Q1 {
    public static void main(String[] args) {

        int[] array1 = {20, 9, 16, 17, 5, 7};
        int[] array2 = {20, 9, 16, 17, 5, 7};
        long start = System.nanoTime();
        Arrays.sort(array1);
        long end = System.nanoTime();
        System.out.println("Time for sorting algorithm: " + (end - start) + " ns");


        start = System.nanoTime();
        quickSort(array2, 0, array2.length - 1);
        end = System.nanoTime();
        System.out.println("Time for quicksort algorithm: " + (end - start) + " ns");

    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }
}




// I got the idea from following website.

//Reference:
//https://www.baeldung.com/java-quicksort