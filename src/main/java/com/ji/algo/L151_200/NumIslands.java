package com.ji.algo.L151_200;/*
    user ji
    data 2019/6/18
    time 3:35 PM
*/

public class NumIslands {
    public static void main(String[] args) {
        char arr[][] = {{}};
        new NumIslands().numIslands(arr);
    }

    public int numIslands(char[][] grid) {
        if (grid == null || grid[0].length == 0)
            return 0;
        int row = grid.length;
        int col = grid[0].length;
        int arr[][] = new int[row][col];
        int count = 1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (arr[i][j] == 0 && grid[i][j] != '0') {
                    help(arr, grid, i, j, count++);
                }
            }
        }
        return count-1;
    }

    public void help(int arr[][], char[][] grid, int row, int col, int count) {
        if (row < 0 || col < 0 || row > grid.length - 1 || col > grid[0].length - 1 || grid[row][col] == '0'||arr[row][col]!=0)
            return;
        arr[row][col] = count;
        help(arr, grid, row + 1, col, count);
        help(arr, grid, row - 1, col, count);
        help(arr, grid, row, col + 1, count);
        help(arr, grid, row, col - 1, count);
    }
}
