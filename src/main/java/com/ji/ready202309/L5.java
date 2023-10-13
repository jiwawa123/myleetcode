package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/08/09:43
 */
public class L5 {
    public static void main(String[] args) {

    }

    public String longestPalindrome(String s) {
        int longest = 1;
        int len = s.length();
        int[][] arr = new int[len][len];
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                boolean f = s.charAt(i) == s.charAt(j);
                if (i - j < 2) {
                    if (f) {
                        arr[i][j] = 1;
                    }
                } else {
                    if (f && arr[i - 1][j + 1] == 1) {
                        arr[i][j] = 1;
                    }
                }
                if (arr[i][j] == 1 && i - j + 1 > longest) {
                    start = j;
                    longest = i - j + 1;
                }

            }
        }

        return s.substring(start, start + longest);
    }
}
