package com.ji.algo.L2451_2500;

/**
 * @Author: Bei Chang
 * @Date: 2022/12/04/下午12:17
 */
public class L2485 {
    public static void main(String[] args) {
        System.out.println(pivotInteger(3));
    }

    public static int pivotInteger(int n) {
        if (n == 1) {
            return 1;
        }
        int sum = (int) ((n / 2.0) * (n + 1));
        int left = 0;
        for (int i = 1; i <= n; i++) {
            left += i;
            if (left == (sum - left + i)) {
                return i;
            }
        }
        return -1;
    }
}
