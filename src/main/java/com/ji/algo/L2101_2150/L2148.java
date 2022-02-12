package com.ji.algo.L2101_2150;

import java.util.Arrays;

/**
 * @Author: Bei Chang
 * @Date: 2022/02/06/下午7:14
 */
public class L2148 {
    public static void main(String[] args) {

    }

    public int countElements(int[] nums) {
        int res = 0;
        Arrays.sort(nums);
        int min = nums[0];
        int len = nums.length - 1;
        int max = nums[len];
        for (int i = 1; i < len; i++) {
            if (nums[i] > min && nums[i] < max) {
                res++;
            }
        }
        return res;
    }
}
