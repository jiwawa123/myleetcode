package com.ji.algo.game;/*
    user ji
    data 2019/10/7
    time 9:48 AM
*/

public class IsValidPalindrome {
    public boolean isValidPalindrome(String s, int k) {
        if(s==null||s.length()==0)
            return true;
        return s.length()-longestPalindromeSubseq(s)<=k;
    }
    public static int longestPalindromeSubseq(String s) {
        if (s == null || s.length() == 0) return 0;
        if(s.length()==1) return 1;
        char[] chars = s.toCharArray();
        if(s.length()==2) return chars[0] == chars[1] ? 2 : 1;

        //三个字符才开始循环判断
        int[][] array = new int[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            array[i][i] = 1;
            for (int j = i-1; j >-1 ; j--) {
                if(chars[j]==chars[i]){
                    array[i][j] = 2 + array[i - 1][j + 1];
                }else {
                    array[i][j] = Math.max(array[i-1][j],array[i][j+1]);
                }
            }
        }
        return array[chars.length-1][0];

    }
}
