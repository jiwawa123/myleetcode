package com.ji.algo.L2551_2600;

/**
 * @Author: Bei Chang
 * @Date: 2023/02/19/下午5:51
 */
public class L6539 {
    public static void main(String[] args) {
        System.out.println(minMaxDifference(199));
    }

    public static int minMaxDifference(int num) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        String s = num + "";
        for (char c : s.toCharArray()) {
            max = Math.max(max, Integer.parseInt(s.replace(c, '9')));
            min = Math.min(min, Integer.parseInt(s.replace(c, '0')));
        }
        return max - min;
    }
}
