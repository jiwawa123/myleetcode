package com.ji.ready202309;

import java.util.Arrays;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/15/08:43
 */
public class L198 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        System.out.println(rob(arr));
    }

    public static int robHelp(int[] nums) {
        int max = 0;
        if (null == nums || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int[] arr1 = new int[nums.length];
        arr1[0] = nums[0];
        arr1[1] = Math.max(nums[0], nums[1]);
        max = arr1[1];
        for (int i = 2; i < nums.length; i++) {
            arr1[i] = Math.max(arr1[i - 1], arr1[i - 2] + nums[i]);
            max = Math.max(max, arr1[i]);
        }
        return max;
    }


    public static int rob(int[] nums) {
        int[] arr1 = Arrays.copyOfRange(nums, 0, nums.length - 1);
        int[] arr2 = Arrays.copyOfRange(nums, 1, nums.length);
        return Math.max(robHelp(arr1), robHelp(arr2));
    }
}
