package com.ji.algo.L2351_2400;

/**
 * @Author: Bei Chang
 * @Date: 2022/08/25/上午8:35
 */
public class L2373 {
    public static void main(String[] args) {
        int[][] arr = {{9, 9, 8, 1}, {5, 6, 2, 6}, {8, 2, 6, 4}, {6, 2, 2, 2}};
        largestLocal(arr);
    }

    public static int[][] largestLocal(int[][] grid) {
        int raw = grid.length - 2;
        int res[][] = new int[raw][raw];
        for (int i = 0; i < raw ; i++) {
            for (int j = 0; j < raw ; j++) {
                int max = 0;
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        max = Math.max(max, grid[k][l]);
                    }
                }
                res[i][j] = max;
            }
        }
        return res;
    }
}
