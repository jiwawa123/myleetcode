package com.ji.algo.L951_1000;/*
    user ji
    data 2019/7/28
    time 9:58 AM
*/

public class OrangesRotting {
    int result[][];

    public int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0)
            return 0;
        result = new int[grid.length][grid[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = Integer.MAX_VALUE;
            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 2) {
                    help(grid, i, j, 0);
                }
            }
        }
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0)
                    continue;
                if (grid[i][j] == 1) {
                    if (result[i][j] == Integer.MAX_VALUE)
                        return -1;
                    max = Math.max(max, result[i][j]);
                }

            }
        }
        return max;
    }

    public void help(int[][] grid, int i, int j, int path) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length)
            return;
        if (result[i][j] <= path)
            return;
        if (grid[i][j] == 0)
            return;
        result[i][j] = path;
        path++;
        help(grid, i - 1, j, path);
        help(grid, i, j + 1, path);
        help(grid, i + 1, j, path);
        help(grid, i, j - 1, path);
    }

    public static void main(String[] args) {
        int arr[][] = {{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(new OrangesRotting().orangesRotting(arr));
    }
}
