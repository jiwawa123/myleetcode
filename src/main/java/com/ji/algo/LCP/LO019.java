package com.ji.algo.LCP;

/**
 * @Author: Bei Chang
 * @Date: 2023/06/10/20:42
 */
public class LO019 {
    public static void main(String[] args) {
        System.out.println(validPalindrome("aydmda"));
    }

    public static boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return (validPalindromeHelp(s.substring(i + 1, j + 1)) || validPalindromeHelp(s.substring(i, j)));
            }
        }
        return true;
    }

    public static boolean validPalindromeHelp(String s) {
        if (s == null || s.length() < 2) {
            return true;
        }
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
