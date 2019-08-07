package com.ji.algo.L0_50;/*
    user ji
    data 2019/4/8
    time 8:57 AM
*/

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindromeII("abcdbbfcba"));
    }

    /*
     使用动态规划的方法来求最长回文串
     */
    public static String longestPalindrome(String s) {
        if (s == null || s.length() <= 1)
            return s;
        int len = s.length();
        boolean flag[][] = new boolean[len][len];
        //对角线上面的都是true
        for (int i = 0; i < len; i++) {
            flag[i][i] = true;
        }
        int start = 0;
        int max = 1;
        for (int i = len - 1; i >= 0; i--) {
            for (int j = i; j < len; j++) {
                if (s.charAt(i) == s.charAt(j) && (j - i) == 1) {
                    flag[i][j] = true;
                    if (max < (j - i + 1)) {
                        max = j - i + 1;
                        start = i;
                    }
                    continue;
                }
                if (s.charAt(i) == s.charAt(j) && i < len - 1 && j > 0 && flag[i + 1][j - 1]) {
                    flag[i][j] = true;
                    if (max < (j - i + 1)) {
                        max = j - i + 1;
                        start = i;
                    }
                }
            }
        }
        return s.substring(start, start + max);
    }


    /*
    0807 重新写这个题目
     */
    public static String longestPalindromeII(String s) {
        if (s == null || s.length() < 2)
            return s;
        int len = s.length();
        int dp[][] = new int[len][len];
        int start = 0;
        int longest = 1;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j <= i; j++) {
                if (i - j < 2) {
                    //如果两个字符串相互挨着就判断是否相同即可
                    if (s.charAt(i) == s.charAt(j)) {
                        dp[i][j] = 1;
                    }
                } else {
                    if (s.charAt(i) == s.charAt(j) && dp[i - 1][j + 1] == 1)
                        dp[i][j] = 1;
                }
                if (dp[i][j] == 1 && i - j + 1 > longest) {
                    start = j;
                    longest = i - j + 1;
                }
            }
        }
        //注意在java中子串的位置

        return s.substring(start, start + longest);
    }
}
