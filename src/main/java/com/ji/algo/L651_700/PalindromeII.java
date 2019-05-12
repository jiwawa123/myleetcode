package com.ji.algo.L651_700;/*
    user ji
    data 2019/5/12
    time 9:51 PM
*/

public class PalindromeII {
    public static void main(String[] args) {

    }

    public boolean validPalindrome(String s) {
        return validPalindrome(s, 0, 0, s.length() - 1);
    }
    //k表示删除字符的次数
    private boolean validPalindrome(String s, int k, int i, int j) {
        if (k > 1) return false;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return validPalindrome(s, k + 1, i + 1, j) || validPalindrome(s, k + 1, i, j-1);
            }
            i++;
            j--;
        }
        return true;
    }
}
