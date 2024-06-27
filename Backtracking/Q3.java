/*

3. In https://www.geeksforgeeks.org/backtracking-introduction/

you can find a few standard backtracking problems. Select one of these problems and write an essay where you explain what the problem is and how it is solved using backtracking.

    Rat in a maze
    Sudoku
    Knights tour
    Magnet puzzle



Answer:

// I will talk about Sudoku

Input: grid
{ {3, 0, 6, 5, 0, 8, 4, 0, 0},
{5, 2, 0, 0, 0, 0, 0, 0, 0},
{0, 8, 7, 0, 0, 0, 0, 3, 1},
{0, 0, 3, 0, 1, 0, 0, 8, 0},
{9, 0, 0, 8, 6, 3, 0, 0, 5},
{0, 5, 0, 0, 9, 0, 6, 0, 0},
{1, 3, 0, 0, 0, 0, 2, 5, 0},
{0, 0, 0, 0, 0, 0, 0, 7, 4},
{0, 0, 5, 2, 0, 6, 3, 0, 0} }


here in the grid, 0 that's mean empty space and we have to solve the puzzle.

Let's try to solve it.

We can do the following approach to solve the quiz:

    1. Create a function that checks if the given matrix is valid sudoku or not. Keep Hashmap for the row, column and boxes. If any number has a frequency greater than 1 in the hashMap return false else return true;
    2. Create a recursive function that takes a grid and the current row and column index.
    3. Check some base cases.
        If the index is at the end of the matrix, i.e. i=N-1 and j=N then check if the grid is safe or not, if safe print the grid and return true else return false.
        The other base case is when the value of column is N, i.e j = N, then move to next row, i.e. i++ and j = 0.
    4. If the current index is not assigned then fill the element from 1 to 9 and recur for all 9 cases with the index of next element, i.e. i, j+1. if the recursive call returns true then break the loop and return true.
    5. If the current index is assigned then call the recursive function with the index of the next element, i.e. i, j+1

implementation of the approach:
 */


package Backtracking;

public class Q3 {
    static int N = 9;

    static boolean solveSudoku(int grid[][], int row, int col) {
        if (row == N - 1 && col == N)
            return true;
        if (col == N) {
            row++;
            col = 0;
        }
        if (grid[row][col] != 0)
            return solveSudoku(grid, row, col + 1);

        for (int num = 1; num < 10; num++) {
            if (isSafe(grid, row, col, num)) {
                grid[row][col] = num;
                if (solveSudoku(grid, row, col + 1))
                    return true;
            }
            grid[row][col] = 0;
        }
        return false;
    }

    static void print(int[][] grid) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(grid[i][j] + " ");
            System.out.println();
        }
    }

    static boolean isSafe(int[][] grid, int row, int col, int num) {
        for (int x = 0; x <= 8; x++)
            if (grid[row][x] == num)
                return false;
        for (int x = 0; x <= 8; x++)
            if (grid[x][col] == num)
                return false;
        int startRow = row - row % 3, startCol = col - col % 3;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (grid[i + startRow][j + startCol] == num)
                    return false;
        return true;
    }

    public static void main(String[] args) {
        int grid[][] = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };

        if (solveSudoku(grid, 0, 0))
            print(grid);
        else
            System.out.println("No Solution exists");
    }
}



// Referance:
// https://www.geeksforgeeks.org/sudoku-backtracking-7/