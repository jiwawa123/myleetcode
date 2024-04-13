package com.ji.algo.LCP;

/**
 * @Author: Bei Chang
 * @Date: 2024/04/08/09:08
 */
public class L100264 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 10};
        longestMonotonicSubarray(arr);
    }

    public static int longestMonotonicSubarray(int[] nums) {
        int res = 0;
        int len = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                len++;
            } else {
                len = 1;
            }
            res = Math.max(res, len);
        }
        len = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                len++;
            } else {
                len = 1;
            }
            res = Math.max(res, len);
        }
        res = Math.max(res, len);

        return res;
    }
}
