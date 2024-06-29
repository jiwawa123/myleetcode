package com.ji.algo.L3151_3200;

/**
 * @Author: Bei Chang
 * @Date: 2024/06/29/08:55
 */
public class L3195 {
    public static void main(String[] args) {
        int[][] arr = {{0, 1, 0}, {1, 0, 1}};
        minimumArea(arr);
    }

    public static int minimumArea(int[][] grid) {
        int up = -1, down = -1, left = -1, right = -1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    continue;
                }

                up = Math.max(up, i);
                right = Math.max(right, j);
                if (down == -1) {
                    down = i;
                }
                if (left == -1) {
                    left = j;
                } else {
                    left = Math.min(left, j);
                }
            }
        }
        if (up == -1) {
            return 0;
        }
        return (right - left + 1) * (up - down + 1);
    }
}
