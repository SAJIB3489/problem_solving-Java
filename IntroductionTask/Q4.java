package IntroductionTask;

/*
4. Create a function for following algorithm:

Input parameter is size n array that contains only positive integers. For each step form a new array of 
which each member is sum of two adjacent members of first array. Continue this until there's only array that has only one member and return this member.

Idea: input parameter [1,2,3] 
Next: [3,5]
Next:[8]
return 8.

For array [1,2,3,4,5] -> [3,5,7,9] ->[8,12,16] -> [20,28] ->[48]  returns 48

*/



public class Q4 {
    public static int sumOfAdjacent(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        if (arr.length == 1) {
            return arr[0];
        }

        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            newArr[i] = arr[i] + arr[i + 1];
        }
        return sumOfAdjacent(newArr);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};     // Create an array of positive integers
        System.out.println(sumOfAdjacent(arr));
    }
}


//I have learned from the following website, it has some great explanation.

//Reference:
//https://www.baeldung.com/java-sum-arrays-element-wise
