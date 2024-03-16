package com.ji.algo.L2951_3000;

import java.util.Arrays;

/**
 * @Author: Bei Chang
 * @Date: 2024/03/16/16:39
 */
public class L2974 {
    public static void main(String[] args) {

    }

    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            int t = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = t;
        }

        return nums;
    }
}
