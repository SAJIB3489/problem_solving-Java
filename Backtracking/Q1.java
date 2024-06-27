package Backtracking;
import java.util.ArrayList;


    /*
    1.  Create an algorithm that will return n sized strings containing alphabetically k first capitals alphabets. For example:

ArrayList<String> form(int n, int k)

form(2,1) // [AA]

form(2,2) // [AA, AB, BA, BB]

form(2,3) // [AA, AB, AC, BA, BB, BC, CA, CB, CC]

form(3,2)) // [AAA, AAB, ABA, ABB, BAA, BAB, BBA, BBB]
     */

public class Q1 {

    public static ArrayList<String> form(int n, int k) {
        ArrayList<String> result = new ArrayList<>();
        char[] current = new char[n];
        search(result, current, 0, k);
        return result;
    }

    private static void search(ArrayList<String> result, char[] current, int index, int k) {
        if (index == current.length) {
            result.add(new String(current));
            return;
        }

// Nested loops to construct the desired string

        for (int i = 0; i < k; i++) {
            current[index] = (char) ('A' + i);
            search(result, current, index + 1, k);
        }
    }

    public static void main(String[] args) {      // It will print
        System.out.println(form(2, 1));
        System.out.println(form(2, 2));
        System.out.println(form(2, 3));
        System.out.println(form(3, 2));
    }
}


// My output is

// [AA]
// [AA, AB, BA, BB]
// [AA, AB, AC, BA, BB, BC, CA, CB, CC]
// [AAA, AAB, ABA, ABB, BAA, BAB, BBA, BBB]

