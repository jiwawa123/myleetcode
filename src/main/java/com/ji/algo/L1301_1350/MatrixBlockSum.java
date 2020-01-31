package com.ji.algo.L1301_1350;/*
    user ji
    data 2020/1/31
    time 10:21 AM
*/

public class MatrixBlockSum {
    public static void main(String[] args) {

    }

    public int[][] matrixBlockSum(int[][] mat, int K) {
        int m = mat.length;
        int n = mat[0].length;
        int res[][] = new int[m][n];
        //使用叠加计算前缀和
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                mat[i][j] += mat[i][j - 1];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int hmin = Math.max(0, i - K);
                int hmax = Math.min(m - 1, i + K);
                int vmin = Math.max(0, j - K);
                int vmax = Math.min(n - 1, j + K);
                for (int k = hmin; k <= hmax; k++) {
                    if(vmin==0)
                        res[i][j] += mat[k][vmax];
                    else
                        res[i][j] += mat[k][vmax] - mat[k][vmin-1];
                }
            }
        }
        return res;
    }
}
