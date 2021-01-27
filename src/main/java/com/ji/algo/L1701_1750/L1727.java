package com.ji.algo.L1701_1750;

import java.util.Arrays;

/**
 * user ji
 * data 2021/1/27
 * time 7:00 下午
 */
public class L1727 {
    public static void main(String[] args) {

    }

    public int largestSubmatrix(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    matrix[i][j] += matrix[i - 1][j];
                }
            }
        }

        int res = 0;
        for (int i = 0; i < m; i++) {
            Arrays.sort(matrix[i]);
            for (int j = n - 1; j >= 0; j--) {
                res = Math.max(res,(n-j)*matrix[i][j]);
            }
        }


        return res;
    }
}
