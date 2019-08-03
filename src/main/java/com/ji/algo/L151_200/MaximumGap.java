package com.ji.algo.L151_200;/*
    user ji
    data 2019/8/3
    time 6:52 PM
*/

import java.util.Arrays;

public class MaximumGap {
    public static void main(String[] args) {

    }

    public int maximumGap(int[] nums) {
        if (nums == null || nums.length <= 1)
            return 0;
        Arrays.sort(nums);
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max, nums[i] - nums[i - 1]);
        }
        return max;
    }
}
