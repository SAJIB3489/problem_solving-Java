package Backtracking;

/*
2. You have a integer table size n. Count how many times you can do subset with sum x?
For example:
int count(int[] t, int x)

count(new int[] {1,2,1,3}, 4)); // 3 (1+2+1 = 4, 1+3 = 4 and 1 + 3 = 4)

count(new int[] {1,1,1,1}, 4)); // 1 (1+1+1+1 =4)
count(new int[] {1,1,1,1,1}, 4)); // 5 (1+1+1+1 =4)
count(new int[] {4,4,4,4}, 4)); // 4 (4=4, 4=4, 4=4, 4=4)
count(new int[] {4,4,4,4,4,4,4,4}, 4)); // 8 (4=4, 4=4, 4=4, 4=4)

 */



public class Q2 {
    private static int n;
    private static int[] numbers;
    private static boolean[] included;
    private static int count = 0;

    public static void search(int k, int target, int sum) {
        if (k == n) {
            if (sum == target) {
                count++;
            }
        } else {
            included[k] = true;
            search(k + 1, target, sum + numbers[k]);
            included[k] = false;
            search(k + 1, target, sum);
        }
    }

    public static int count(int[] t, int x) {
        count = 0;
        n = t.length;
        numbers = new int[n];
        included = new boolean[n];
        System.arraycopy(t, 0, numbers, 0, n);
        search(0, x, 0);
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count(new int[]{1, 2, 1, 3}, 4));
        System.out.println(count(new int[]{1, 1, 1, 1}, 4));
        System.out.println(count(new int[]{1, 1, 1, 1, 1}, 4));
        System.out.println(count(new int[]{4, 4, 4, 4}, 4));
        System.out.println(count(new int[]{4, 4, 4, 4, 4, 4, 4, 4}, 4));
    }
}


// My output is

// 3
// 1
// 5
// 4
// 8
