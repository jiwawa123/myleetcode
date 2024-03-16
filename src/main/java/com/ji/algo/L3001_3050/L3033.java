package com.ji.algo.L3001_3050;

/**
 * @Author: Bei Chang
 * @Date: 2024/03/09/11:49
 */
public class L3033 {
    public static void main(String[] args) {

    }

    public int[][] modifiedMatrix(int[][] matrix) {
        int[] col = new int[matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                col[i] = Math.max(col[i], matrix[i][j]);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = col[j];
                }
            }
        }
        return matrix;
    }
}
