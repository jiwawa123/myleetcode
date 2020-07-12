package com.ji.algo.second;

/**
 * user ji
 * data 2020/7/1
 * time 9:02 上午
 */
public class FindLongLength {
    public static void main(String[] args) {

    }

    public int findLength(int[] A, int[] B) {
        if (A == null || B == null || A.length == 0 || B.length == 0)
            return 0;
        int res = 0;
        int row = A.length;
        int col = B.length;
        int dp[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (A[i] == B[j]) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = 1 + dp[i-1][j-1];
                    }
                    res = Math.max(res,dp[i][j]);
                }
            }
        }

        return res;
    }
}
