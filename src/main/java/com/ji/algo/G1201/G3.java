package com.ji.algo.G1201;/*
    user ji
    data 2019/12/1
    time 10:24 AM
*/

public class G3 {
    public static void main(String[] args) {
        int arr[][] = {
                {0,1,1,1},
                {1,1,1,1},
                {0,1,1,1}
        };
        System.out.println(countSquares(arr));
    }

    public static int countSquares(int[][] matrix) {
        int count = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int arr_row[][] = new int[row][col];
        int arr_col[][] = new int[row][col];
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    arr_row[i][j] = 0;
                    arr_col[i][j] = 0;
                    arr[i][j] = 0;
                    continue;
                }
                count++;
                if (i == 0 && j == 0) {
                    arr_row[i][j] = 1;
                    arr_col[i][j] = 1;
                    arr[i][j] = 1;
                    continue;
                }
                if (i == 0) {
                    arr_row[i][j] = 1 + arr_row[i][j - 1];
                    arr_col[i][j] = 1;
                    arr[i][j] = 1;
                    continue;
                }
                if (j == 0) {
                    arr_col[i][j] = 1 + arr_col[i - 1][j];
                    arr_row[i][j] = 1;
                    arr[i][j] = 1;
                    continue;
                }

                int min = Math.min(arr_row[i][j - 1], arr_col[i - 1][j]);
                min = Math.min(min, arr[i - 1][j - 1]);
                count += min;
                arr[i][j] = min+1;
                arr_row[i][j] = arr_row[i][j - 1] + 1;
                arr_col[i][j] = arr_col[i - 1][j] + 1;
            }
        }
        return count;
    }
}
