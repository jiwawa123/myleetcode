package com.ji.algo.G0531;

import java.util.Arrays;

/**
 * user ji
 * data 2020/5/31
 * time 10:28 上午
 */
public class G1 {
    public static void main(String[] args) {

    }

    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length - 1;
        return Math.max((nums[0] - 1) * (nums[1] - 1), (nums[len] - 1) * (nums[len - 1] - 1));
    }
}
