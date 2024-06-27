package sorting;

/*

2. Make a function of which input is array has odd amount of integers in it. Each number occurs twice except one. 
Create an algorithm to find that unique one. Hint, you can use the idea of countsort algorithm

For example [1,2,1,2,3,4,3,4,5] should return 5,

[7,6,5,4,3,2,1,2,3,4,5,6,7] should return 1 and

[5,3,4,7,5,3,7] should return 4.

 */

public class Q2 {
    public static int UniqueNum(int[] arr) {
        int count[] = new int[101];
        for (int num : arr) {
            count[num]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 1) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 1, 5, 7, 9, 3, 3, 7, 1};
        int[] arr2 = {10, 30, 20, 10, 69, 30, 70, 20, 90, 70, 22, 90, 22};
        int[] arr3 = {2, 6, 7, 7, 6, 2, 5};
        System.out.println("The Unique number is Array 1: " + UniqueNum(arr1));
        System.out.println("The Unique number is Array 2: " + UniqueNum(arr2));
        System.out.println("The Unique number is Array 3: " + UniqueNum(arr3));
    }
}

// I got the idea from following website.

//Reference:
//https://www.geeksforgeeks.org/print-distinct-elements-given-integer-array/