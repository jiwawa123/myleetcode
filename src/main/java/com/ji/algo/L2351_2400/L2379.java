package com.ji.algo.L2351_2400;

/**
 * @Author: Bei Chang
 * @Date: 2022/08/25/上午8:28
 */
public class L2379 {
    public static void main(String[] args) {
        System.out.println(minimumRecolors("WBBWWBBWBW", 7));
    }

    public static int minimumRecolors(String blocks, int k) {
        int min = k;
        for (int i = 0; i <= blocks.length() - k; i++) {
            int m = 0;
            for (int j = i; j < i + k; j++) {
                if (blocks.charAt(j) == 'W') {
                    m++;
                }
            }
            min = Math.min(min, m);
            if (m == 0) {
                return 0;
            }

        }
        return min;
    }
}
