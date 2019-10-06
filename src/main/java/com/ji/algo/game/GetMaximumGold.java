package com.ji.algo.game;/*
    user ji
    data 2019/10/6
    time 4:43 PM
*/

public class GetMaximumGold {
    public static void main(String[] args) {

    }

    int max = 0;

    public int getMaximumGold(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 0) {
                    help(grid, i, j, 0, new int[grid.length][grid[0].length]);
                }
            }
        }
        return max;
    }

    public void help(int grid[][], int row, int col, int all, int flag[][]) {
        max = Math.max(all, max);
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == 0 || flag[row][col] == 1) {
            return;
        }
        int tmp[][] = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                tmp[i][j] = flag[i][j];
            }
        }
        tmp[row][col] = 1;
        all += grid[row][col];
        help(grid, row - 1, col, all, tmp);
        help(grid, row, col + 1, all, tmp);
        help(grid, row + 1, col, all, tmp);
        help(grid, row, col - 1, all, tmp);
    }
}
