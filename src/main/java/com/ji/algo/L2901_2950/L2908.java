package com.ji.algo.L2901_2950;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/28/15:57
 */
public class L2908 {
    public static void main(String[] args) {

    }

    public int minimumSum(int[] nums) {
        int res = -1;
        for (int i = 1; i < nums.length - 1; i++) {
            int l = nums[i], r = nums[i];
            for (int j = i - 1; j >= 0; j--) {
                l = Math.min(l, nums[j]);
            }
            for (int j = i + 1; j < nums.length; j++) {
                r = Math.min(r, nums[j]);
            }
            if (nums[i] > l && nums[i] > r) {
                int sum = nums[i] + l + r;
                if (res == -1) {
                    res = sum;
                } else {
                    res = Math.min(res, sum);
                }
            }
        }
        return res;
    }
}
