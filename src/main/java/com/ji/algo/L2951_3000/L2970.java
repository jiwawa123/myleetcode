package com.ji.algo.L2951_3000;

/**
 * @Author: Bei Chang
 * @Date: 2024/03/09/22:44
 */
public class L2970 {
    public static void main(String[] args) {

    }

    public int incremovableSubarrayCount(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isIncrArr(nums, res)) {
                res++;
            }
        }
        return res;
    }

    public boolean isIncrArr(int[] nums, int index) {
        for (int i = 1; i < nums.length; i++) {
            if (index == 0 && i == 1) {
                continue;
            }
            if (index == 1) {
                continue;
            }

            if (index == i - 1) {
                if (nums[i] > nums[i - 2]) {
                    continue;
                } else {
                    return false;
                }
            }
            if (nums[i] < nums[i - 1]) {
                return false;
            }

        }

        return true;
    }
}
