package com.ji.ready202309;

import java.util.Arrays;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/10/10:17
 */
public class L518 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5};
        change(5, arr);
    }

    public static int change(int amount, int[] coins) {
        int[] arr = new int[amount + 1];
        arr[0] = 1;
        Arrays.sort(coins);
        for (int coin : coins) {
            // 记录每添加一种面额的零钱，总金额j的变化
            for (int j = 1; j <= amount; j++) {
                if (j >= coin) {
                    // 在上一钟零钱状态的基础上增大
                    // 例如对于总额5，当只有面额为1的零钱时，只有一种可能 5x1
                    // 当加了面额为2的零钱时，除了原来的那一种可能外
                    // 还加上了组合了两块钱的情况，而总额为5是在总额为3的基础上加上两块钱来的
                    // 所以就加上此时总额为3的所有组合情况
                    arr[j] = arr[j] + arr[j - coin];
                }
            }
        }
        return arr[amount];
    }
}
