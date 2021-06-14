package com.ji.algo.L1851_1900;

import java.util.Arrays;

/**
 * user ji
 * data 2021/6/11
 * time 8:26 下午
 */
public class L1877 {
    public static void main(String[] args) {

    }

    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int mid = nums.length / 2;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < mid; i++) {
            res = Math.min(res, nums[i] + nums[nums.length - i - 1]);
        }
        return res;
    }
}
