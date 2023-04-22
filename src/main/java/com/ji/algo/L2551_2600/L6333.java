package com.ji.algo.L2551_2600;

/**
 * @Author: Bei Chang
 * @Date: 2023/04/16/11:26
 */
public class L6333 {
    public static void main(String[] args) {

    }

    public int[] findColumnWidth(int[][] grid) {
        int len = grid[0].length;
        int[] res = new int[len];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < len; j++) {
                res[j] = Math.max(res[j], (grid[i][j] + "").length());
            }
        }

        return res;
    }
}
