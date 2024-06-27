package EfficiencyAnalysis;

/*

3. You have an array with n integers in it. Make an algorithm that counts how many 
times array can be divided so that sum of members of each section is the same.
For example [1,2,-1,4,0] can be divided to [1] and [2,-1,4,0], [1,2] and [-1,4,0], 
[1,2,-1] and [4,0] and [1,2,-1,4] and [0], but only [1,2] and [-1,4,0] sums are both 3. 
So if input is [1,2,-1,4,0], output is "1", input [1,2,3,4,5] should have output "0" and [0,0,0,0,0] has output of "4". 

*/


public class Q3 {
    static int countDivisions(int arr[], int n) {
        if (n == 1) {
            return 0;
        }
        int totalsum = 0, sum = 0, count = 0;

        for (int i = 0; i < n; i++) {
            totalsum += arr[i];
        }

        for (int i = 0; i < n - 1; i++) {
            sum += arr[i];
            if (sum == totalsum / 2) {
                count++;
            }
        }
        return count;
    }

    // The inputs are here.

    public static void main(String[] args)
    {
        int arr[] = {1,2,-1,4,0};
        int arr2[] = {1,2,3,4,5};
        int arr3[] = {0,0,0,0,0};
        int n = arr.length;

        System.out.println("Output for the first Array = " +countDivisions(arr, n));
        System.out.println("Output for the second Array = " +countDivisions(arr2, n));
        System.out.println("Output for the third Array = " +countDivisions(arr3, n));
    }
}

//I have followed those websites and examples, to get the idea about questions.

//Reference:
//https://www.geeksforgeeks.org/counting-frequencies-of-array-elements/
//https://www.w3schools.com/java/default.asp