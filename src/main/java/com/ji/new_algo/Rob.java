package com.ji.new_algo;/*
    user ji
    data 2019/6/4
    time 10:24 AM
*/

public class Rob {
    public static void main(String[] args) {

    }

    public int rob(int[] nums) {
        if (nums == null || nums.length < 1)
            return 0;
        if (nums.length < 2)
            return nums[0];

        int arr[] = new int[nums.length];
        arr[0] = nums[0];
        arr[1] = Math.max(arr[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            arr[i] = Math.max(arr[i - 1], arr[i] + arr[i - 2]);
        }
        return arr[nums.length - 1];
    }
}
