package com.ji.algo.L501_550;/*
    user ji
    data 2019/8/21
    time 9:31 AM
*/

public class LongestPalindromeSubseq {
    public static void main(String[] args) {

    }

    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int dp[] = new int[n];
        int i , j, max;
        for (j = 0; j < n; j++) {
            dp[j] = 1;
            max = 0;
            for (i = j - 1; i >= 0; i--) {
                int tmp = dp[i];
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i] = max + 2;
                }
                max = Math.max(tmp, max);
            }
        }

        max = 0;
        for (i = 0; i < n; i++) {
            max = Math.max(max, dp[i]);
        }

        return max;
    }
}
