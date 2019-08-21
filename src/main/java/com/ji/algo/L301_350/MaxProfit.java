package com.ji.algo.L301_350;/*
    user ji
    data 2019/8/21
    time 9:47 AM
*/

public class MaxProfit {
    public static void main(String[] args) {
        int arr[] = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit122(arr));
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

    public static int maxProfit121(int[] prices) {
        if (prices == null || prices.length < 2)
            return 0;
        int min = prices[0];
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            max = Math.max(max, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return max;
    }

    public static int maxProfit122(int[] prices) {
        if (prices == null || prices.length < 2)
            return 0;
        int count = 0;
        int tmp = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (tmp + prices[i] > 0) {
                count += tmp + prices[i];
                tmp = -prices[i];
            } else {
                tmp = -Math.min(-tmp, prices[i]);
            }
        }
        return count;
    }
}
