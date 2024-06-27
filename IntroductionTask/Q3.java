package IntroductionTask;

/*

3. A substring is a part of string. For example in 'Savonia' has substrings 'von' and 'avo'.  
Create an algorithm that counts how many time substring can be found from string. For example if function is called countOccurrence

int countOccurrence("Kukukuguuuguu", "ku")

Would return 3
 */


public class Q3 {
    public static void main(String[] args) {
        String str = "kukukuguuuguu";  //In your question, the first "K" letter is in capital letters.
        String substr = "ku";
        int count = countOccurrence(str, substr);
        System.out.println("The number of occurrences of \"" + substr + "\" in \"" + str + "\" is " + count);
    }

    public static int countOccurrence(String str, String substr) {
        int count = 0;
        int index = str.indexOf(substr);
        while (index != -1) {
            count++;
            index = str.indexOf(substr, index + 1);
        }
        return count;
    }
}



//I have learned from the following website, there are some examples with python code and I got the idea from it.

//Reference:
//https://www.geeksforgeeks.org/python-ways-to-count-number-of-substring-in-string/