package com.ji.algo.L2101_2150;

/**
 * @Author: Bei Chang
 * @Date: 2022/01/16/下午9:41
 */
public class L2133 {
    public static void main(String[] args) {

    }

    public boolean checkValid(int[][] matrix) {
        int len = matrix.length;
        for (int i = 0; i < len; i++) {
            int[] arr = new int[len + 1];
            for (int j = 0; j < len; j++) {
                if (arr[matrix[i][j]] > 0) {
                    return false;
                }
                arr[matrix[i][j]] = 1;
            }
        }

        for (int i = 0; i < len; i++) {
            int[] arr = new int[len + 1];
            for (int j = 0; j < len; j++) {
                if (arr[matrix[j][i]] > 0) {
                    return false;
                }
                arr[matrix[j][i]] = 1;
            }
        }

        return true;
    }
}
