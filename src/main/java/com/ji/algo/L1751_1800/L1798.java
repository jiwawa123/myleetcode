package com.ji.algo.L1751_1800;

import java.util.Arrays;

/**
 * user ji
 * data 2021/3/24
 * time 3:18 下午
 */
public class L1798 {
    public static void main(String[] args) {

    }

    public int getMaximumConsecutive(int[] coins) {
        Arrays.sort(coins);
        int t = 1;
        for (int i = 0; i < coins.length; i++)
            if (coins[i] <= t)
                t = t + coins[i];
            else break;
        return t;


    }
}

