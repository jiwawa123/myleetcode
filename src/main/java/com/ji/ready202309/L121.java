package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/07/08:45
 */
public class L121 {
    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int res = 0;
        for (int n : prices
        ) {
            if (min > n) {
                min = n;
            } else {
                res = Math.max(n - min, res);
            }
        }
        return res;
    }
}
