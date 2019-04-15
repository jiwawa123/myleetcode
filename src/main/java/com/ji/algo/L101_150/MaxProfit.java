package com.ji.algo.L101_150;/*
    user ji
    data 2019/4/15
    time 2:34 PM
*/

public class MaxProfit {
    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices) {
        int max = 0;
        if (null == prices || prices.length == 0)
            return max;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }else{
                max = Math.max(prices[i] - min,max);
            }
        }
        return max;
    }
}
