package com.ji.algo.L2451_2500;

/**
 * @Author: Bei Chang
 * @Date: 2022/12/21/上午8:53
 */
public class L2496 {
    public static void main(String[] args) {

    }

    public int maximumValue(String[] strs) {
        int max = 0;
        for (int i = 0; i < strs.length; i++) {
            max = Math.max(max, cal(strs[i]));
        }
        return max;
    }

    public int cal(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                return str.length();
            }
        }
        return Integer.valueOf(str);
    }
}
