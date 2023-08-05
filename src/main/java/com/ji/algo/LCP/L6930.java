package com.ji.algo.LCP;

import java.util.Arrays;

/**
 * @Author: Bei Chang
 * @Date: 2023/07/23/11:17
 */
public class L6930 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 2};
        System.out.println(isGood(arr));
    }

    public static boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length - 1;
        int max = nums.length - 1;
        for (int i = len ; i >= 0; i--) {
            if (i == len - 1 || i == len ) {
                if (max != nums[i]) {
                    return false;
                }
            } else {
                if (i != nums[i] - 1) {
                    return false;
                }
            }
        }

        return true;
    }
}
