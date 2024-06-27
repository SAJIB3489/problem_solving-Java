package IntroductionTask;

/*

2. Create Java algorithm that counts sum of number characters of 
given number. For example 1 -> 1, 11->2 (as 1+ 1 = 2), 312 -> 6 (as 3 + 1 + 2 = 6) 

 */


public class Q2 {
    public static void main(String[] args) {
        int n = 312;   //we can change the value that we want to calculate for example 1435.
        int sum = 0;
        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        System.out.println("The sum of digits of the given number is " + sum); //It will return/print the sum
    }
}


//I have learned from the following website, that there are many examples relevant of this algorithm.

//Reference:
// https://www.geeksforgeeks.org/program-for-sum-of-the-digits-of-a-given-number/
//https://www.studytonight.com/java-programs/java-program-to-count-the-total-number-of-characters-in-a-string