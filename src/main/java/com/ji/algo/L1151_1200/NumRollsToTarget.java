package com.ji.algo.L1151_1200;/*
    user ji
    data 2019/8/26
    time 5:17 PM
*/

public class NumRollsToTarget {
    public static void main(String[] args) {
        System.out.println(numRollsToTarget(1, 6, 3));
    }

    public static int numRollsToTarget(int f, int d, int target) {
        if (target < 0)
            return 0;
        int max = 1000000007;
        int dp[][] = new int[f + 1][target + 1];
        for (int i = 0; i < f; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i < target + 1; i++) {
            dp[0][target] = 0;
        }
        for (int i = 1; i < target + 1 && i <= d; i++) {
            dp[1][i] = 1;
        }
        for (int i = 1; i < f + 1; i++) {
            for (int j = 0; j <= target; j++) {
                for (int k = 1; k <= d && k <= target; k++) {
                    if (j + k <= target) {
                        dp[i][j + k] += dp[i - 1][j] % max;
                    } else {
                        break;
                    }
                }
            }
        }
        return dp[f][target];
    }
}
