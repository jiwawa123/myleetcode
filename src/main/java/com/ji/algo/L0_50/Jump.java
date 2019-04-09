package com.ji.algo.L0_50;/*
    user ji
    data 2019/4/9
    time 10:32 AM
*/

import java.util.Arrays;

public class Jump {
    public static void main(String[] args) {

    }
    //动态规划，记录每次可以走到的最远距离，同时每次走的时候更新这次可以走到的最远距离
    public int jump(int[] nums) {
        if(nums.length == 1) return 0;
        int reach = 0;
        int nextreach = nums[0];
        int step = 0;
        for(int i = 0;i<nums.length;i++){
            nextreach = Math.max(i+nums[i],nextreach);
            if(nextreach >= nums.length-1) return (step+1);
            if(i == reach){
                step++;
                reach = nextreach;
            }
        }
        return step;
    }
}
