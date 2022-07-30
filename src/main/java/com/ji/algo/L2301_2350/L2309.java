package com.ji.algo.L2301_2350;

/**
 * @Author: Bei Chang
 * @Date: 2022/07/25/上午8:11
 */
public class L2309 {
    public static void main(String[] args) {

    }

    public String greatestLetter(String s) {
        int[] up = new int[26];
        int[] low = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                low[c - 'a'] += 1;
            } else {
                up[c - 'A'] += 1;
            }
        }
        for (int i = 25; i >= 0; i--) {
            if (low[i] > 0 && up[i] > 0) {
                return "" + (char) (('A' + i));
            }
        }
        return "";
    }
}
