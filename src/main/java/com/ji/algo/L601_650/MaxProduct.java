package com.ji.algo.L601_650;/*
    user ji
    data 2019/5/12
    time 9:08 AM
*/

import java.util.Arrays;

public class MaxProduct {
    public static void main(String[] args) {

    }
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int max = Math.max(nums[0]*nums[1]*nums[nums.length-1],nums[nums.length-1]*nums[nums.length-3]*nums[nums.length-2]);
        return max;
    }
}
