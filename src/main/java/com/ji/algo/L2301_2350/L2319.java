package com.ji.algo.L2301_2350;

/**
 * @Author: Bei Chang
 * @Date: 2022/07/19/下午10:00
 */
public class L2319 {
    public static void main(String[] args) {

    }

    public boolean checkXMatrix(int[][] grid) {

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (i == j || i + j == grid.length - 1) {
                    if (grid[i][j] == 0) {
                        return false;
                    }
                } else {
                    if (grid[i][j] != 0) {
                        return false;
                    }
                }


            }
        }

        return true;
    }
}
