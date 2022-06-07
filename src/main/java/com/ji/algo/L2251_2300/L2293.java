package com.ji.algo.L2251_2300;

/**
 * @Author: Bei Chang
 * @Date: 2022/06/06/下午8:47
 */
public class L2293 {
    public static void main(String[] args) {
        int[] arr = {3};
        System.out.println(minMaxGame(arr));
    }

    public static int minMaxGame(int[] nums) {
        int step = nums.length / 2;
        while (step > 0) {
            for (int i = 0; i < step; i++) {
                if (i % 2 == 0) {
                    nums[i] = Math.min(nums[i * 2], nums[i * 2 + 1]);
                } else {
                    nums[i] = Math.max(nums[i * 2], nums[i * 2 + 1]);
                }
            }
            step--;
        }
        return nums[0];
    }
}
