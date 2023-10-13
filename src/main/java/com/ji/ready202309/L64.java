package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/09/18:05
 */
public class L64 {
    public static void main(String[] args) {

    }

    public int minPathSum(int[][] grid) {
        int len = grid.length;
        int col = grid[0].length;
        int[] arr = new int[col];
        for (int i = 0; i < len; i++) {
            int tmp[] = new int[col];
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0) {
                    if (j == 0) {
                        tmp[j] = grid[0][0];
                    } else {
                        tmp[j] = grid[0][j] + tmp[j - 1];
                    }
                } else {
                    if (j == 0) {
                        tmp[j] = arr[j];
                    } else {
                        tmp[j] = Math.min(arr[j], tmp[j - 1]) + grid[i][j];
                    }
                }
            }
            arr = tmp;
        }


        return arr[col - 1];
    }
}
