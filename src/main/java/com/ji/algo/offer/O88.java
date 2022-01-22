package com.ji.algo.offer;

/**
 * @Author: Bei Chang
 * @Date: 2022/01/22/下午9:36
 */
public class O88 {
    public static void main(String[] args) {
        int[] arr = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(minCostClimbingStairs(arr));
    }

    public static int minCostClimbingStairs(int[] cost) {

        int[] arr = new int[cost.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MAX_VALUE;
        }
        arr[0] = 0;
        arr[1] = 0;
        for (int i = 0; i < cost.length; i++) {
            arr[i + 1] = Math.min(arr[i + 1], arr[i] + cost[i]);
            if (i + 2 < arr.length) {
                arr[i + 2] = Math.min(arr[i + 2], arr[i] + cost[i]);
            }


        }
        return arr[cost.length];
    }
}
