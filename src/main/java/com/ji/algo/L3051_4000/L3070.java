package com.ji.algo.L3051_4000;

/**
 * @Author: Bei Chang
 * @Date: 2024/03/18/08:37
 */
public class L3070 {

    public static void main(String[] args) {

    }


    public int countSubmatrices(int[][] grid, int k) {
        int cnt = 0;
        // 一次遍历
        for (int m = 0; m < grid.length; m++) {
            for (int n = 0; n < grid[0].length; n++) {
                // 左上角
                if (m == 0 && n == 0) {
                    if (grid[m][n] > k) {
                        return cnt;
                    }
                    cnt++;
                    continue;
                }

                // 1、原地更新计算矩阵和，类似求前缀和
                if (m == 0) {
                    // 第一行
                    grid[m][n] += grid[m][n - 1];
                } else if (n == 0) {
                    // 第一列
                    grid[m][n] += grid[m - 1][n];
                } else {
                    // 当前矩阵元素和=当前元素+左侧矩阵和+上方元素（利用前缀和求差）
                    grid[m][n] += grid[m][n - 1] + (grid[m - 1][n] - grid[m - 1][n - 1]);
                }

                // 2、比较
                if (grid[m][n] > k) {
                    break;
                } else {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
