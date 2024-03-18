package com.ji.algo.L2951_3000;

/**
 * @Author: Bei Chang
 * @Date: 2024/03/09/22:44
 */
public class L2970 {
    public static void main(String[] args) {
        int[] arr = {8, 7, 6, 6};
        new L2970().incremovableSubarrayCount(arr);
    }

    public int incremovableSubarrayCount(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (isIncrArr(nums, i, j)) {
                    res++;
                } else {
                    continue;
                }
            }
        }
        return res;
    }

    public boolean isIncrArr(int[] nums, int start, int end) {
        if (start == 0) {
            return isIncrArrNotSkip(nums, end + 1, nums.length);
        }

        if (end == nums.length - 1) {
            return isIncrArrNotSkip(nums, 0, start - 1);
        }
        if (nums[start - 1] >= nums[end + 1]) {
            return false;
        }
        return isIncrArrNotSkip(nums, 0, start - 1) && isIncrArrNotSkip(nums, end + 1, nums.length);
    }

    public boolean isIncrArrNotSkip(int[] nums, int start, int end) {
        if (start >= end) {
            return true;
        }
        for (int i = start; i < end && i < nums.length - 1; i++) {
            if (nums[i + 1] <= nums[i]) {
                return false;
            }
        }

        return true;
    }
}
