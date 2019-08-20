package com.ji.algo.L701_750;/*
    user ji
    data 2019/8/20
    time 9:39 AM
*/

public class MinimumDeleteSum {
    public static void main(String[] args) {
        System.out.println(minimumDeleteSum("sea", "eat"));
    }

    public static int minimumDeleteSum(String s1, String s2) {
        int[][] dp = new int[s2.length() + 1][s1.length() + 1];
        for (int i = 1; i < s1.length() + 1; i++) {
            dp[0][i] = s1.charAt(i - 1) - '0' + 48 + dp[0][i - 1];
        }
        for (int i = 1; i < s2.length() + 1; i++) {
            dp[i][0] = s2.charAt(i - 1) - '0' + 48 + dp[i - 1][0];
        }
        for (int j = 1; j < s2.length() + 1; ++j) {
            for (int i = 1; i < s1.length() + 1; i++) {
                if (s2.charAt(j - 1) == s1.charAt(i - 1)) {
                    dp[j][i] = dp[j - 1][i - 1];
                } else {
                    int min = dp[j - 1][i] + s2.charAt(j - 1) - '0' + 48;
                    min = Math.min(min, dp[j][i - 1] + s1.charAt(i - 1) - '0' + 48);
                    min = Math.min(min, dp[j - 1][i - 1] + s1.charAt(i - 1) - '0' + 48 + s2.charAt(j - 1) - '0' + 48);
                    dp[j][i] = min;
                }
            }
        }
        return dp[s2.length()][s1.length()];
    }
}
