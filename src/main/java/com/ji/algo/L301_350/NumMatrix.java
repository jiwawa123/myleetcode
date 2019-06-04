package com.ji.algo.L301_350;/*
    user ji
    data 2019/6/4
    time 8:07 AM
*/

public class NumMatrix {
    int sum[][];

    public NumMatrix(int[][] matrix) {
        if (null == matrix || matrix.length == 0)
            return;
        sum = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (j == 0)
                    sum[i][j] = matrix[i][j];
                else {
                    sum[i][j] += sum[i][j - 1];
                    sum[i][j] += matrix[i][j];
                }

            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int count = 0;
        for (int i = row1; i <= row2; i++) {
            if (col1 > 0)
                count += sum[i][col2] - sum[i][col1 - 1];
            else
                count += sum[i][col2];
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[][] = {{3, 0, 1, 4, 2}, {5, 6, 3, 2, 1}, {1, 2, 0, 1, 5}, {4, 1, 0, 1, 7}, {1, 0, 3, 0, 5}};
        NumMatrix matrix = new NumMatrix(arr);
        System.out.println(matrix.sumRegion(2, 1, 4, 3));
    }
}
