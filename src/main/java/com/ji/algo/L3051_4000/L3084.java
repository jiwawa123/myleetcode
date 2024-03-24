package com.ji.algo.L3051_4000;

/**
 * @Author: Bei Chang
 * @Date: 2024/03/24/20:37
 */
public class L3084 {
    public static void main(String[] args) {

    }

    public long countSubstrings(String s, char c) {
        long res = 0;
        long last = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                res++;
                res += last;
                last++;
            }
        }


        return res;
    }
}
