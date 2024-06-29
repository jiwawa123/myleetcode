package com.ji.algo.L3001_3050;

/**
 * @Author: Bei Chang
 * @Date: 2024/05/01/10:45
 */
public class L3110 {
    public static void main(String[] args) {

    }

    public int scoreOfString(String s) {
        int res = 0;
        for (int i = 1; i < s.length(); i++) {
            res += Math.abs(s.charAt(i) - s.charAt(i - 1));
        }
        return res;
    }
}
