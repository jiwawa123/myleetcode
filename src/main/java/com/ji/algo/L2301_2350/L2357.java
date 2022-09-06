package com.ji.algo.L2301_2350;

import java.util.Arrays;

/**
 * @Author: Bei Chang
 * @Date: 2022/08/06/下午6:08
 */
public class L2357 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 0, 3, 5};
        System.out.println(minimumOperations(arr));
    }

    public static int minimumOperations(int[] nums) {
        int res = 0;
        int index = 0;
        Arrays.sort(nums);
        while (index < nums.length) {
            int min = 0;
            for (int i = index; i < nums.length; i++) {
                if (nums[i] == 0) {
                    index = i + 1;
                } else {
                    if (min != 0) {
                        nums[i] -= min;
                    } else {
                        min = nums[i];
                        index = i + 1;
                        res++;
                    }
                }

            }
        }
        return res;
    }
}
