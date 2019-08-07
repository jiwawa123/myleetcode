package com.ji.algo.L1051_1100;/*
    user ji
    data 2019/8/5
    time 10:18 AM
*/

public class ShortestPathBinaryMatrix {
    public static void main(String[] args) {
        int arr[][] = {{0, 0, 1}, {1, 0, 0}, {0, 0, 0}};
        System.out.println(shortestPathBinaryMatrix(arr));
    }

    public static int shortestPathBinaryMatrix(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 && j == 0) {
                    if (grid[i][j] == 1)
                        return -1;
                    else {
                        arr[i][j] = 1;
                        continue;
                    }

                }
                arr[i][j] = Integer.MAX_VALUE;
                if (grid[i][j] == 1) {
                    arr[i][j] = -1;
                    continue;
                }
                if (i > 0 && j > 0) {
                    if (arr[i - 1][j - 1] != -1) {
                        arr[i][j] = Math.min(arr[i][j], arr[i - 1][j - 1] + 1);
                    }
                }
                if (i > 0) {
                    if (arr[i - 1][j] != -1) {
                        arr[i][j] = Math.min(arr[i][j], arr[i - 1][j] + 1);
                    }
                }
                if (j > 0) {
                    if (arr[i][j - 1] != -1) {
                        arr[i][j] = Math.min(arr[i][j], arr[i][j - 1] + 1);
                    }
                }
                if (arr[i][j] == Integer.MAX_VALUE)
                    arr[i][j] = -1;
            }
        }
        return arr[row - 1][col - 1];
    }
}
