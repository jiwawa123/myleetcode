package com.ji.algo.G1004;

/**
 * user ji
 * data 2020/10/5
 * time 9:29 上午
 */
public class G3 {
    public static void main(String[] args) {

    }

    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int m = rowSum.length, n = colSum.length;
        int[][] res = new int[m][n];
        int[] row = new int[m];
        int[] col = new int[n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                res[i][j] = Math.min(rowSum[i] - row[i], colSum[j] - col[j]);
                row[i] += res[i][j];
                col[j] += res[i][j];
            }
        return res;
    }
}
