package com.ji.algo.L701_750;/*
    user ji
    data 2019/8/14
    time 9:32 AM
*/

public class MaxProfit {
    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        if (n <= 1)
            return 0;
        int buy = -prices[0];
        int cash = 0;
        for (int i = 1; i < n; i++) {
            cash = Math.max(cash, buy + prices[i] - fee);
            buy = Math.max(buy, cash - prices[i]);
        }
        return cash;
    }
}
