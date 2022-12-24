package com.ji.algo.L2401_2450;

/**
 * @Author: Bei Chang
 * @Date: 2022/12/22/上午8:46
 */
public class L2414 {
    public static void main(String[] args) {
        System.out.println(longestContinuousSubstring("abacaba"));
        System.out.println(longestContinuousSubstring("abcde"));
    }

    public static int longestContinuousSubstring(String s) {
        int res = 0;
        int tmp = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == (s.charAt(i - 1) + 1)) {
                tmp++;
            } else {
                tmp = 1;
            }
            res = Math.max(tmp, res);
        }
        return res;
    }
}
