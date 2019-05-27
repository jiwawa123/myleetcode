package com.ji.algo.L351_400;/*
    user ji
    data 2019/5/27
    time 9:02 AM
*/

import java.util.ArrayList;
import java.util.List;

public class CombineSum4 {
    public static void main(String[] args) {

        CombineSum4 sum4 = new CombineSum4();
        long a = System.currentTimeMillis();
        int arr[] = {1, 2, 3};
        System.out.println(sum4.combinationSum4(arr, 32));
        System.out.println(System.currentTimeMillis() - a);
    }

    public int combinationSum4(int[] nums, int target) {
        int[] memo = new int[target + 1];
        memo[0] = 1;
        for (int i = 0; i < target; i++) {
            for (int num : nums) {
                if (i + num <= target) {
                    memo[i + num] += memo[i];
                }
            }
        }
        return memo[target];
    }
}
