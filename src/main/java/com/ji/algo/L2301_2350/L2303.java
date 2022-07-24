package com.ji.algo.L2301_2350;

/**
 * @Author: Bei Chang
 * @Date: 2022/07/19/下午9:50
 */
public class L2303 {
    public static void main(String[] args) {
        int[][] brackets = {{3, 50}, {7, 10}, {2, 25}};
        System.out.println(calculateTax(brackets, 10));
    }

    public static double calculateTax(int[][] brackets, int income) {
        double res = 0.0;
        int last = 0;
        for (int b = 0; b < brackets.length; b++) {
            int start = brackets[b][0];
            int rate = brackets[b][1];
            res += (income >= start ? start - last : (income - last)) * rate / 100;
            last = start;
            if (start >= income) {
                break;
            }
        }
        return res;
    }
}
