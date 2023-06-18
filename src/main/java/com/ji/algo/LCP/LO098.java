package com.ji.algo.LCP;

/**
 * @Author: Bei Chang
 * @Date: 2023/06/11/15:55
 */
public class LO098 {
    public static void main(String[] args) {

    }

    public int uniquePaths(int m, int n) {
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
                }
            }
        }
        return arr[m - 1][n - 1];
    }
}
