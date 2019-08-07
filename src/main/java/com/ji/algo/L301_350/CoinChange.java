package com.ji.algo.L301_350;/*
    user ji
    data 2019/8/7
    time 9:38 AM
*/

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int coins[] = {1,2};
        System.out.println(coinChange(coins, 2));
    }

    public static int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int len = coins.length;
        int arr[][] = new int[len + 1][amount + 1];
        arr[0][0] = 0;
        for (int i = 1; i < len + 1; i++) {
            arr[i][0] = 0;
        }
        for (int i = 1; i < amount + 1; i++) {
            arr[0][i] = -1;
        }
        for (int i = 1; i < len + 1; i++) {
            for (int j = 1; j < amount + 1; j++) {
                arr[i][j] = -1;
                if (arr[i - 1][j] != -1) {
                    arr[i][j] = arr[i - 1][j];
                }
                if (j - coins[i - 1] >= 0) {
                    if (arr[i - 1][j - coins[i - 1]] != -1) {
                        if (arr[i][j] == -1) {
                            arr[i][j] = 1 + arr[i - 1][j - coins[i - 1]];
                        } else {
                            arr[i][j] = Math.min(arr[i][j], 1 + arr[i - 1][j - coins[i - 1]]);
                        }

                    }

                    if (arr[i][j - coins[i - 1]] != -1) {
                        if (arr[i][j] == -1) {
                            arr[i][j] = 1 + arr[i][j - coins[i - 1]];
                        } else {
                            arr[i][j] = Math.min(arr[i][j], 1 + arr[i][j - coins[i - 1]]);
                        }
                    }

                }

            }
        }
        return arr[len][amount];

    }
}
