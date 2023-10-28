package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/13/09:04
 */
public class L150 {
    public static void main(String[] args) {

    }


    public int maxSubarraySumCircular(int[] nums) {
        int res = nums[0];
        int len = nums.length;
        int[] leftMax = new int[len];
        leftMax[0] = 0;
        int pre = nums[0];
        int leftSum = nums[0];
        for (int i = 0; i < len; i++) {
            pre = Math.max(pre + nums[i], nums[i]);
            res = Math.max(res, pre);
            leftSum += nums[i];
            leftMax[i] = Math.max(leftSum, leftMax[i - 1]);
        }
        int rightSum = 0;
        for (int i = len - 1; i > 0; i--) {
            rightSum += nums[i];
            res = Math.max(res, rightSum + leftMax[i - 1]);
        }
        return res;

    }
}
