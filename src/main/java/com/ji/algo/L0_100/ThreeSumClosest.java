package com.ji.algo.L0_100;/*
    user ji
    data 2019/4/8
    time 11:06 AM
*/

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {

    }
    public int threeSumClosest(int[] nums, int target) {
        int min = Integer.MAX_VALUE;
        int re = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int start = i+1;
            int end = nums.length-1;
            while(start<end){
                if(nums[i]+nums[start]+nums[end]==target)
                    return target;
                else if(nums[i]+nums[start]+nums[end]>target){
                    if(Math.abs(target - (nums[i]+nums[start]+nums[end]))<min){
                        min = Math.abs(target - (nums[i]+nums[start]+nums[end]));
                        re = nums[i]+nums[start]+nums[end];
                    }
                    end--;
                }else{
                    if(Math.abs(target - (nums[i]+nums[start]+nums[end]))<min){
                        min = Math.abs(target - (nums[i]+nums[start]+nums[end]));
                        re = nums[i]+nums[start]+nums[end];
                    }
                    start++;
                }
            }
        }
        return re;
    }

}
