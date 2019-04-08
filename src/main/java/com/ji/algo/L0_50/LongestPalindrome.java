package com.ji.algo.L0_50;/*
    user ji
    data 2019/4/8
    time 8:57 AM
*/

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("bb"));
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
                if(s.charAt(i)==s.charAt(j)&&(j-i)==1){
                    flag[i][j] = true;
                    if(max<(j-i+1)){
                        max = j-i+1;
                        start = i;
                    }
                    continue;
                }
                if (s.charAt(i)==s.charAt(j)&&i<len-1&&j>0&&flag[i+1][j-1]){
                    flag[i][j] = true;
                    if(max<(j-i+1)){
                        max = j-i+1;
                        start = i;
                    }
                }
            }
        }
        return s.substring(start, start + max);
    }
}
