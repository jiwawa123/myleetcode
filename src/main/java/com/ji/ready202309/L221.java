package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/09/17:29
 */
public class L221 {
    public static void main(String[] args) {
        char[][] arr = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        maximalSquare(arr);
    }

    public static int maximalSquare(char[][] matrix) {
        int max = 0;
        int row = matrix.length, col = matrix[0].length;
        int[][] arrRow = new int[row][col];
        int[][] arrCol = new int[row][col];
        int[][] dp = new int[row][col];
        for (int i = 0; i < row; i++) {
            int sum = 0;
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == '1') {
                    sum++;

                    // 初始化dp数组第一列
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    }
                    max = 1;
                } else {
                    sum = 0;
                }
                arrRow[i][j] = sum;

            }
        }
        for (int i = 0; i < col; i++) {
            int sum = 0;
            for (int j = 0; j < row; j++) {
                if (matrix[j][i] == '1') {
                    sum++;
                } else {
                    sum = 0;
                }
                arrCol[j][i] = sum;
            }
        }


        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (matrix[i][j] == '0') {
                    dp[i][j] = 0;
                    continue;
                }
                int rowLen = arrRow[i][j];
                int colLen = arrCol[i][j];
                int len = Math.min(rowLen, colLen);
                int last = dp[i - 1][j - 1];
                int q = 0;
                if (last == 0) {
                    dp[i][j] = 1;
                } else {
                    q = (int) Math.sqrt(last);
                    len = Math.min(len, q + 1);
                    dp[i][j] = len * len;

                }


                max = Math.max(max, dp[i][j]);
            }
        }

        return max;
    }
}
