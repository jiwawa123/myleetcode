package com.ji.algo.L2751_2800;

/**
 * @Author: Bei Chang
 * @Date: 2023/07/08/19:36
 */
public class L2760 {
    public static void main(String[] args) {
        int[] arr = {4, 10, 3};
        System.out.println(new L2760().longestAlternatingSubarray(arr, 10));
    }

    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int res = 0;
        int len = 0;
        int last = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > threshold) {
                len = 0;
                last = -1;
            } else {
                if (last == -1) {
                    if (nums[i] % 2 == 0) {
                        len = 1;
                        last = nums[i];
                    }
                } else {
                    boolean f = isMatch(last, nums[i]);
                    if (f) {
                        len++;
                        last = nums[i];
                    } else {
                        if (nums[i] % 2 == 0) {
                            len = 1;
                            last = nums[i];
                        } else {
                            last = -1;
                            len = 0;
                        }
                    }
                }

            }
            res = Math.max(res, len);
        }
        return res;
    }

    public boolean isMatch(int a, int b) {
        return a % 2 != b % 2;
    }
}
