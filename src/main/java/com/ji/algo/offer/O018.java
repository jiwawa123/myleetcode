package com.ji.algo.offer;

/**
 * @Author: Bei Chang
 * @Date: 2022/09/11/上午11:48
 */
public class O018 {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll(" ", "");
        int i = 0, j = s.length() - 1;
        while (i < j) {
            boolean f1 = isNoC(s.charAt(i));
            boolean f2 = isNoC(s.charAt(j));
            if (f1 && f2) {
                if (s.charAt(i) != s.charAt(j)) {
                    return false;
                }
                i++;
                j--;
                continue;
            }
            if (!f1) {
                i++;
            }
            if (!f2) {
                j--;
            }

        }
        return true;
    }

    public boolean isNoC(char c) {
        if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
            return true;
        }
        return false;
    }
}
