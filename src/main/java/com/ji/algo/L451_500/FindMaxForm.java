package com.ji.algo.L451_500;/*
    user ji
    data 2019/5/3
    time 10:49 PM
*/

import java.util.Arrays;
import java.util.Comparator;

public class FindMaxForm {
    public static void main(String[] args) {
        String arr[] =  {"10", "0001", "111001", "1", "0"};
        findMaxForm(arr,5,3);
    }

    public static int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (String s : strs) {
            int zeros = 0;
            int ones = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    zeros++;
                } else {
                    ones++;
                }
            }

            for (int i = m; i >= zeros; i--) {
                for (int j = n; j >= ones; j--) {
                    int zeroLeft = i - zeros;
                    int oneLeft = j - ones;
                    dp[i][j] = Math.max(dp[i][j], 1 + dp[zeroLeft][oneLeft]);
                }
            }
        }
        return dp[m][n];
    }
}
