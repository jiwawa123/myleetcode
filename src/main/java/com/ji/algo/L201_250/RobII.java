package com.ji.algo.L201_250;/*
    user ji
    data 2019/4/21
    time 8:35 PM
*/

public class RobII {
    public static void main(String[] args) {
        int[] arr = {2, 7, 9, 3, 1};
        System.out.println(rob(arr));
    }

    public static int rob(int[] nums) {
        int max = 0;
        if (nums == null || nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];
        //开始不考虑最后一个元素
        int f = nums[0];
        int s = Math.max(nums[0], nums[1]);
        max = Math.max(f, s);
        for (int i = 2; i < nums.length - 1; i++) {
            max = Math.max(s, nums[i] + f);
            f = s;
            s = max;

        }
        f = nums[nums.length - 1];
        s = Math.max(nums[nums.length-1], nums[nums.length-2]);
        int min = Math.min(f, s);
        for (int i = nums.length - 3; i > 0; i--) {
            min = Math.max(s, nums[i] + f);
            f = s;
            s = min;

        }
        return Math.max(max, min);
    }
}
