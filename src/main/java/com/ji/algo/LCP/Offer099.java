package com.ji.algo.LCP;

/**
 * @Author: Bei Chang
 * @Date: 2023/06/24/10:33
 */
public class Offer099 {
    public static void main(String[] args) {

    }

    public int minPathSum(int[][] grid) {
        int[] tmp = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < tmp.length; j++) {
                if (i == 0 && j == 0) {
                    tmp[j] = grid[i][j];
                    continue;
                }
                if (i == 0) {
                    tmp[j] = grid[i][j] + tmp[j - 1];
                    continue;
                }

                if (j == 0) {
                    tmp[j] = grid[i][j] + tmp[j];
                    continue;
                }

                tmp[j] = Math.max(tmp[j - 1], tmp[j]) + grid[i][j];
            }
        }
        return tmp[grid[0].length - 1];
    }
}
