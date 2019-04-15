package com.ji.algo.L101_150;/*
    user ji
    data 2019/4/15
    time 2:47 PM
*/

public class MaxProfitII {
    public static void main(String[] args) {

    }

    public int maxProfit(int[] array) {
        int max = 0;
        if (null == array || array.length == 0)
            return max;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > min) {
                max += array[i] - min;
                min = Integer.MAX_VALUE;
            } else {
                min = array[i];
            }
        }
        return max;
    }
}
