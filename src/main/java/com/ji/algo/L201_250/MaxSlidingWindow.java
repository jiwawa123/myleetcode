package com.ji.algo.L201_250;/*
    user ji
    data 2019/7/1
    time 5:14 PM
*/

public class MaxSlidingWindow {
    public static void main(String[] args) {

    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length==0)
            return nums;
        int res[] = new int[nums.length-k+1];
        for(int i = 0;i<nums.length-k+1;i++){
            int max = Integer.MIN_VALUE;
            for(int j = i;j<i+k;j++){
                max = Math.max(max,nums[j]);
            }
            res[i] = max;
        }
        return res;
    }
}
