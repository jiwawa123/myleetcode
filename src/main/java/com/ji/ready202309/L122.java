package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/09/21:58
 */
public class L122 {
    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices) {
        int res = 0;

        int start = Integer.MAX_VALUE;
        for (int p : prices
        ) {
            if (p > start) {
                res += (p - start);
            }
            start = p;
        }
        return res;
    }
}
