package com.ji.algo.L301_350;/*
    user ji
    data 2019/8/21
    time 9:47 AM
*/

public class MaxProfit {
    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices) {
        int len = prices.length;
        int sell[] = new int[len];
        int buy[] = new int[len];
        int cool[] = new int[len];
        buy[0] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            sell[i] = Math.max(buy[i - 1] + prices[i], sell[i - 1]);
            buy[i] = Math.max(cool[i - 1] - prices[i], buy[i - 1]);
            cool[i] = Math.max(Math.max(sell[i - 1], cool[i - 1]), buy[i - 1]);
        }
        return sell[len - 1];
    }
}
