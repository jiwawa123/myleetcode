package com.ji.algo.L801_850;/*
    user ji
    data 2019/8/5
    time 9:07 AM
*/

public class NumMagicSquaresInside {
    public static void main(String[] args) {

    }

    public int numMagicSquaresInside(int[][] grid) {
        int count = 0;
        if (grid == null || grid.length < 3 || grid[0].length < 3)
            return count;
        for (int i = 0; i <= grid.length - 3; i++) {
            for (int j = 0; j <= grid[0].length - 3; j++) {
                if (help(grid, i, j))
                    count++;
            }
        }
        return count;
    }

    public boolean help(int[][] grid, int row, int col) {
        int arr[] = new int[9];
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                if (grid[i][j] == 0 || grid[i][j] >= 10)
                    return false;
                if (arr[grid[i][j] - 1] > 0)
                    return false;
                arr[grid[i][j] - 1]++;
            }
        }
        if (grid[row][col] + grid[row + 1][col] + grid[row + 2][col] != 15)
            return false;
        if (grid[row][col + 1] + grid[row + 1][col + 1] + grid[row + 2][col + 1] != 15)
            return false;
        if (grid[row][col + 2] + grid[row + 1][col + 2] + grid[row + 2][col + 2] != 15)
            return false;
        if (grid[row][col] + grid[row][col + 1] + grid[row][col + 2] != 15)
            return false;
        if (grid[row + 1][col] + grid[row + 1][col + 1] + grid[row + 1][col + 2] != 15)
            return false;
        if (grid[row + 2][col] + grid[row + 2][col + 1] + grid[row + 2][col + 2] != 15)
            return false;
        if (grid[row][col] + grid[row + 1][col + 1] + grid[row + 2][col + 2] != 15)
            return false;
        if (grid[row + 2][col] + grid[row + 1][col + 1] + grid[row][col + 2] != 15)
            return false;

        return true;
    }
}
