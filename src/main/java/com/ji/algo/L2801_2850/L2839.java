package com.ji.algo.L2801_2850;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/28/16:54
 */
public class L2839 {
    public static void main(String[] args) {

    }

    public boolean canBeEqual(String s1, String s2) {
        int[] a1 = new int[26];
        int[] a2 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0) {
                a1[s1.charAt(i) - 'a'] += 1;
            } else {
                a2[s1.charAt(i) - 'a'] += 1;
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            int index = s2.charAt(i) - 'a';
            if (i % 2 == 0) {
                a1[index] -= 1;
                if (a1[index] == -1) {
                    return false;
                }
            } else {
                a2[index] -= 1;
                if (a2[index] == -1) {
                    return false;
                }
            }
        }
        return false;
    }
}
