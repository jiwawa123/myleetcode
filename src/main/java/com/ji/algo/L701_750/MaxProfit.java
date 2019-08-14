package com.ji.algo.L701_750;/*
    user ji
    data 2019/8/14
    time 9:32 AM
*/

public class MaxProfit {
    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices, int fee) {
        if (prices == null || prices.length < 2)
            return 0;
        int dp1[] = new int[prices.length];
        int dp2[] = new int[prices.length];
        dp1[0] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp1[i] = Math.max(dp1[i - 1], dp2[i - 1] - prices[i]);
            dp2[i] = Math.max(dp2[i - 1], dp1[i - 1] + prices[i] - fee);
        }
        return dp2[prices.length - 1];
    }
}
