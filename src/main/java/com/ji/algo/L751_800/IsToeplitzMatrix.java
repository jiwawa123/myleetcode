package com.ji.algo.L751_800;/*
    user ji
    data 2019/5/14
    time 5:03 PM
*/

public class IsToeplitzMatrix {
    public static void main(String[] args) {
        int matrix[][] = {
                {1, 2, 3, 4},
                {5, 1, 2, 3},
                {9, 5, 1, 2}
        };
        System.out.println(isToeplitzMatrix(matrix));
    }

    public static boolean isToeplitzMatrix(int[][] matrix) {
        if (null == matrix || matrix.length == 0)
            return true;
        for (int i = 0; i < matrix[0].length; i++) {
            int m = 0 + 1;
            int n = i + 1;
            while (m < matrix.length && n < matrix[0].length) {
                if (matrix[m++][n++] != matrix[0][i]) {
                    return false;
                }
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            int m = i + 1;
            int n = 1;
            while (m < matrix.length && n < matrix[i].length) {
                if (matrix[m++][n++] != matrix[i][0]) {
                    return false;
                }
            }
        }
        return true;
    }
}
