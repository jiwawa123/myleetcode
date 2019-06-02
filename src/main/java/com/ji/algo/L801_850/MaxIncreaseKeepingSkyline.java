package com.ji.algo.L801_850;/*
    user ji
    data 2019/6/2
    time 6:15 PM
*/

public class MaxIncreaseKeepingSkyline {
    public static void main(String[] args) {

    }

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int row[] = new int[grid.length];
        int col[] = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                row[i] = Math.max(row[i], grid[i][j]);
            }
        }
        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 0; j < grid.length; j++) {
                col[i] = Math.max(col[i], grid[j][i]);
            }
        }
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                count += Math.min(row[i], col[j]) - grid[i][j];
            }
        }
        return count;
    }
}
