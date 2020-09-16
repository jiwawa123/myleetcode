package com.ji.algo.xhs;

import java.util.Arrays;

/**
 * user ji
 * data 2020/9/12
 * time 10:23 上午
 */
public class G2 {
    public static void main(String[] args) {
        System.out.println(solutionII("abaccd"));
    }


    static int solution(String s) {
        if (s == null || s.length() < 2)
            return 1;
        int len = s.length();
        if (s.charAt(0) == s.charAt(len - 1))
            return 1;
        int res = Integer.MAX_VALUE;
        for (int i = len - 1; i >= 0; i--) {
            if (s.charAt(0) == s.charAt(i))
                res = Math.min(res, 1 + solution(s.substring(i + 1)));
            if (res == 2)
                return res;
        }
        return res;
    }


    static int solutionII(String s) {
        if (s == null || s.length() < 2)
            return 1;
        int len = s.length();
        if (s.charAt(0) == s.charAt(len - 1))
            return 1;
        int dp[][] = new int[len][len];
        Arrays.fill(dp[0], 1);
        for (int i = 0; i < len; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < s.length(); i++) {
            for (int j = 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        return dp[len - 1][len - 1];
    }

}
