package com.ji.algo.L3001_3050;

/**
 * @Author: Bei Chang
 * @Date: 2024/03/09/22:10
 */
public class L3019 {
    public static void main(String[] args) {

    }

    public int countKeyChanges(String s) {
        int res = 0;
        s = s.toLowerCase();
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                res++;
            }
        }
        return res;
    }
}
