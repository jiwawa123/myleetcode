package com.ji.algo.L1301_1350;/*
    user ji
    data 2020/2/3
    time 10:23 AM
*/

public class MinDifficulty {
    public static void main(String[] args) {

    }
    //动态规划求解即可
    public int minDifficulty(int[] jobDifficulty, int D) {
        int N = jobDifficulty.length;
        int[][] peaks = new int[N][N];
        for (int i = 0; i < N; ++i) {
            for (int j = i; j < N; ++j) {
                if (i == j) {
                    peaks[i][j] = jobDifficulty[i];
                } else {
                    peaks[i][j] = Math.max(peaks[i][j-1], jobDifficulty[j]);
                }
            }
        }

        int[][] dp = new int[N][D + 1];
        // to split (0 -> n) as d parts !!
        for (int i = 0; i < N; i++) {
            for (int d = 1; d <= D; ++d) {
                if (d == 1) {
                    dp[i][d] = peaks[0][i];
                    continue;
                }

                if (d > (i+1)) {
                    dp[i][d] = -1;
                    continue;
                }

                int v = Integer.MAX_VALUE;
                for (int j = i; j >= (d - 1); --j) {
                    v = Math.min(v, dp[j-1][d-1] + peaks[j][i]);
                }
                dp[i][d] = v;
            }
        }
        return dp[N-1][D];
    }
}
