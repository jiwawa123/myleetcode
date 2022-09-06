package com.ji.algo.L2301_2350;

/**
 * @Author: Bei Chang
 * @Date: 2022/07/31/上午10:53
 */
public class L2348 {
    public static void main(String[] args) {

    }

    public long zeroFilledSubarray(int[] nums) {
        int count = 0;
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                len++;
            } else {
                count += (len + 1) * len / 2;
                len = 0;
            }
        }
        return count + (len + 1) * len / 2;
    }
}
