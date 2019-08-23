package com.ji.algo.L451_500;/*
    user ji
    data 2019/8/23
    time 9:33 PM
*/

import java.util.Arrays;

public class Makesquare {
    public boolean makesquare(int[] nums) {
        if (nums == null || nums.length < 4)
            return false;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum % 4 != 0)
            return false;
        int[] sums = new int[4];
        Arrays.sort(nums);
        return dfs(nums,sums,nums.length - 1,sum / 4);
    }
    public boolean dfs(int[] nums,int[] sums,int i,int target){
        if (i < 0){
            return sums[0] == target && sums[1] == target && sums[2] == target;
        }
        for (int j = 0;j < 4;j ++){
            if (sums[j] + nums[i] > target) continue;
            sums[j] += nums[i];
            if (dfs(nums,sums,i - 1,target)) return true;
            sums[j] -= nums[i];
        }
        return false;
    }
}
