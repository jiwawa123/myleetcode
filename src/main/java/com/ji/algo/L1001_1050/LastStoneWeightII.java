package com.ji.algo.L1001_1050;/*
    user ji
    data 2019/5/28
    time 8:48 AM
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LastStoneWeightII {
    public static void main(String[] args) {
        int arr[] = {2, 7, 4, 1, 8, 1};
        System.out.println(lastStoneWeightII(arr));
    }

    public static int lastStoneWeightII(int[] stones) {
        /* 由于石头拿走还能放回去，因此可以简单地把所有石头看作两堆
         * 假设总重量为 sum, 则问题转化为背包问题：如何使两堆石头总重量接近 sum / 2
         */
        int len = stones.length;
        /* 获取石头总重量 */
        int sum = 0;
        for (int i : stones) {
            sum += i;
        }
        /* 定义 dp[i] 重量上限为 i 时背包所能装载的最大石头重量 */
        int maxCapacity = sum/2;
        int[] dp = new int[maxCapacity + 1];
        for (int i = 0; i < len; i++) {
            int curStone = stones[i];
            for (int j = maxCapacity; j >= curStone; j--) {
                dp[j] = Math.max(dp[j], dp[j-curStone] + curStone);
            }
        }
        return sum - 2 * dp[maxCapacity];
    }
}
