package com.ji.algo.L3001_3050;

/**
 * @Author: Bei Chang
 * @Date: 2024/04/04/15:35
 */
public class L3034 {
    public static void main(String[] args) {

    }

    public static int countMatchingSubarrays(int[] nums, int[] pattern) {
        int res = 0;
        for (int i = 0; i < nums.length - pattern.length; i++) {
            if (isMatch(nums, i, pattern)) {
                res++;
            }
        }
        return res;
    }

    public static boolean isMatch(int[] nums, int start, int[] pattern) {
        for (int i = 0; i < pattern.length; i++) {
            switch (pattern[i]) {
                case 0:
                    if (nums[start + 1 + i] != nums[start + i]) {
                        return false;
                    }
                    break;
                case 1:
                    if (nums[start + 1 + i] <= nums[start + i]) {
                        return false;
                    }
                    break;
                case -1:
                    if (nums[start + 1 + i] >= nums[start + i]) {
                        return false;
                    }
                    break;
            }
        }

        return true;
    }
}
