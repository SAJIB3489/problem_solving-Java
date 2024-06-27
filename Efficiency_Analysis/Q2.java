package EfficiencyAnalysis;
import java.util.*;

/*

  2. You have an array with n integers in it. Make an algorithm that calculates the amount 
  of changes to be made so that array doesn't have consecutive expressions in it. 

 */


public class Q2 {
    public static int ChangesAmount(int[] arr) {
        int changes = 0;
        int arrSize = arr.length;
        for (int i = 0; i < arrSize - 2; i++) {
            if (arr[i] == arr[i + 1]) {
                arr[i + 1]++;
                if (arr[i + 1] == arr[i + 2])
                    arr[i + 1]++;
                changes++;
            }
        }
        if (arr[arrSize - 2] == arr[arrSize - 1]) {
            arr[arrSize - 1]++;
            changes++;
        }
        System.out.println(Arrays.toString(arr));
        return changes;
    }
    // The inputs are here.
    public static void main(String[] args) {
        int arr[] = {1,3,2,1,2};
        int arr2[] = {1,2,3,4,5};
        int arr3[] = {1, 1, 1, 1, 1};
        System.out.println("Output for the first Array = " + ChangesAmount(arr));
        System.out.println("Output for the Second Array = " + ChangesAmount(arr2));
        System.out.println("Output for the Third Array = " + ChangesAmount(arr3));

    }
}

//I have a bit confusion about the first array output. If it not correct perhaps  I didn't understand the question properly.
//I have learned from the following website, there are some examples with python, C and others language including java and I got the idea from it.

//Reference:
//https://www.geeksforgeeks.org/minimum-number-swaps-required-sort-array/
//https://www.w3schools.com/java/default.asp