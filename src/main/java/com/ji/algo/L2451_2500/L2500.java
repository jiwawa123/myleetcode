package com.ji.algo.L2451_2500;

import java.util.Arrays;

/**
 * @Author: Bei Chang
 * @Date: 2022/12/21/上午8:58
 */
public class L2500 {
    public static void main(String[] args) {

    }

    public int deleteGreatestValue(int[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            Arrays.sort(grid[i]);
        }
        for (int i = grid[0].length - 1; i >= 0; i--) {
            int max = 0;
            for (int j = 0; j < grid.length; j++) {
                max = Math.max(max, grid[j][i]);
            }
            res += max;
        }
        return res;
    }
}
