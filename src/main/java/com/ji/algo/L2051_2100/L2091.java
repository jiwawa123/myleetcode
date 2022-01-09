package com.ji.algo.L2051_2100;

/**
 * @Author: Bei Chang
 * @Date: 2022/01/09/下午9:39
 */
public class L2091 {
    public static void main(String[] args) {
        int[] arr = {-14, 61, 29, -18, 59, 13, -67, -16, 55, -57, 7, 74};
        System.out.println(minimumDeletions(arr));
    }

    public static int minimumDeletions(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int l = -1, r = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                l = i;
            }
            if (nums[i] < min) {
                min = nums[i];
                r = i;
            }
        }
        int res = Math.min(Math.max(l, r) + 1, Math.min(l, r) + 1 + nums.length - Math.max(l, r));
        res = Math.min(res, nums.length - Math.min(r, l));
        return res;
    }
}
