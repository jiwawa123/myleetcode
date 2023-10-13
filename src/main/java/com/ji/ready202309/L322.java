package com.ji.ready202309;

import java.util.Arrays;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/09/13:56
 */
public class L322 {


    public static void main(String[] args) {
        int[] arr = {1, 2, 5};
        System.out.println(coinChange(arr, 11));
    }

    public static int coinChange(int[] coins, int amount) {
        int[] arr = new int[amount + 1];
        Arrays.fill(arr, Integer.MAX_VALUE);
        arr[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int c : coins
            ) {
                if (i - c >= 0 && arr[i - c] != Integer.MAX_VALUE) {
                    arr[i] = Math.min(arr[i - c] + 1, arr[i]);
                }
            }
        }

        return arr[amount] == Integer.MAX_VALUE ? -1 : arr[amount];
    }
}
