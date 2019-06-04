package com.ji.algo.L451_500;/*
    user ji
    data 2019/6/4
    time 2:52 PM
*/

public class FindMaxFormII {
    public static void main(String[] args) {

    }

    public int findMaxForm(String[] strs, int m, int n) {
        int dp[][] = new int[m + 1][n + 1];
        for (int i = 0; i < strs.length; i++) {
            int one = 0;
            int zero = 0;
            for (char a : strs[i].toCharArray()
                    ) {
                if (a == '1')
                    one++;
                else zero++;
            }
            for (int j = m; j >= zero; j--) {
                for (int k = n; k >= one; k--) {
                    dp[j][k] = Math.max(dp[j][k], dp[j - zero][k - one] + 1);
                }
            }
        }
        return dp[m][n];
    }
}
