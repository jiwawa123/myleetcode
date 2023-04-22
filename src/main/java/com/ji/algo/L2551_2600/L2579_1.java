package com.ji.algo.L2551_2600;

/**
 * @Author: Bei Chang
 * @Date: 2023/04/15/10:57
 */
public class L2579_1 {
    public static void main(String[] args) {
        System.out.println(coloredCells(69675));
    }

    public static long coloredCells(int n) {
        long m = n;
        long res = (1 + (2 * m - 3)) * (m - 1);

        return res + 2 * m - 1;

    }
}
