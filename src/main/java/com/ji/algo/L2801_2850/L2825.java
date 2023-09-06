package com.ji.algo.L2801_2850;

/**
 * @Author: Bei Chang
 * @Date: 2023/08/24/20:58
 */
public class L2825 {
    public static void main(String[] args) {

    }

    public boolean canMakeSubsequence(String str1, String str2) {
        int i = 0, j = 0;
        while (i < str1.length() && j < str2.length()) {
            if (str1.charAt(i) == str2.charAt(j) ||
                    (str1.charAt(i) - 'a' + 1) % 26 == str2.charAt(j) - 'a') {
                i++;
                j++;
            } else {
                i++;
            }

        }

        return j == str2.length();
    }
}
