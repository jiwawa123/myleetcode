package com.ji.algo.L151_200;/*
    user ji
    data 2019/4/16
    time 9:34 PM
*/

import java.util.Arrays;

public class Rob {
    public static void main(String[] args) {

    }

    public int rob(int[] nums) {
        if (null == nums || nums.length == 0)
            return 0;
        int arr[] = new int[nums.length];
        arr[0] = nums[0];
        int max = arr[0];
        for (int i = 1; i < nums.length; i++) {
            if (i == 1) {
                if (nums[i] < nums[i - 1]) {
                    arr[i] = arr[i - 1];
                } else {
                    arr[i] = nums[i];

                }
            } else {
                arr[i] = Math.max(arr[i - 2] + nums[i], arr[i - 1]);
            }
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public int robII(int[] nums) {
        int max = 0;
        if (null == nums || nums.length == 0)
            return 0;
        int f = nums[0];
        max = Math.max(f, max);
        if (nums.length == 1)
            return max;
        int s = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            int tmp = Math.max(f + nums[i], s);
            f = s;
            s = tmp;
        }
        return max;
    }
}
