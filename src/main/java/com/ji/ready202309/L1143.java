package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/09/11:27
 */
public class L1143 {
    public static void main(String[] args) {
        System.out.println(new L1143().longestCommonSubsequence("abcde", "ace"));
    }

    public int longestCommonSubsequence(String text1, String text2) {
        int l1 = text1.length();
        int l2 = text2.length();
        int[][] arr = new int[l1 + 1][l2 + 1];
        for (int i = 1; i <= l1; i++) {
            for (int j = 1; j <= l2; j++) {
                int max = Math.max(arr[i - 1][j - 1], arr[i - 1][j]);
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    arr[i][j] = max + 1;
                } else {
                    arr[i][j] = max;
                }
            }
        }
        return arr[l1][l2];
    }
}
