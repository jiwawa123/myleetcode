package com.ji.algo.L451_500;/*
    user ji
    data 2019/8/12
    time 4:34 PM
*/

import java.util.Arrays;

public class MinMoves2 {
    public static void main(String[] args) {

    }
    public int minMoves2(int[] nums) {
        if(nums==null||nums.length==0||nums.length==1)
            return 0;
        Arrays.sort(nums);
        int med = 0;
        if(nums.length%2==0){
            med = nums[nums.length/2-1];
        }else{
            med = nums[nums.length/2];
        }
        int all = 0;
        for(int k:nums)
            all += Math.abs(k - med);
        return all;
    }
}
