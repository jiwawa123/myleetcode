package com.ji.algo.L701_750;/*
    user ji
    data 2019/9/28
    time 4:11 PM
*/

public class L746 {
    public static int minCostClimbingStairs(int[] cost) {
        if (cost == null || cost.length == 0)
            return 0;
        if (cost.length == 1)
            return cost[0];
        int res[] = new int[cost.length + 1];
        if (cost.length == 2)
            return Math.min(res[0], res[1]);
        for (int i = 2; i <= cost.length; i++) {
            res[i] = Math.min(res[i - 1] + cost[i - 1], res[i - 2] + cost[i - 2]);
        }
        return res[cost.length];
    }

    public static void main(String[] args) {
        int arr[] = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(minCostClimbingStairs(arr));
    }
}
