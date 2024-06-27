/* Question 1. Provide pseudo code algorithm that counts sum of number 
characters of given number. For example 1 -> 1, 11->2 (as 1+ 1 = 2), 312 -> 6 (as 3 + 1 + 2 = 6) 
*/


function sumOfDigits(n) {
  sum = 0;
  while (n != 0) {
    sum = sum + n % 10;
    n = n // 10;
  }
  return sum;
}


//Explanation : I take a function called sumOfDigits that takes an integer n as input.
// Then the function iterates over the digits of n from the rightmost digit to the leftmost digit,
// adding each digit to the sum variable. Finally, the function returns the value of sum.


//I have learned from the following website, that there are many examples relevant of this algorithm.

//Reference:
// https://www.geeksforgeeks.org/program-for-sum-of-the-digits-of-a-given-number/
//https://www.studytonight.com/java-programs/java-program-to-count-the-total-number-of-characters-in-a-string