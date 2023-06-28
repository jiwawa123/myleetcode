package com.ji.algo.L2201_2250;

/**
 * @Author: Bei Chang
 * @Date: 2023/06/25/21:50
 */
public class L2221 {
    public static void main(String[] args) {

    }

    public int triangularSum(int[] nums) {
        while (nums.length > 1) {
            int len = nums.length;
            int[] arr = new int[len - 1];
            for (int i = 0; i < len - 1; i++) {
                arr[i] = (nums[i] + nums[i + 1]) % 10;
            }
            nums = arr;
        }
        return nums[0];
    }
}
