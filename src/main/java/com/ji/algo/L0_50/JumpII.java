package com.ji.algo.L0_50;/*
    user ji
    data 2019/8/22
    time 9:02 AM
*/

import java.util.Arrays;

public class JumpII {
    public static void main(String[] args) {

    }

    public int jump(int[] nums) {
        if (nums.length <= 2)
            return nums.length - 1;
        int next = 0;
        int nextest = nums[0];
        int step = 0;
        for (int i = 0; i < nums.length; i++) {
            nextest = Math.max(nums[i] + i, nextest);
            if (nextest >= nums.length - 1)
                return step + 1;
            if (i == next) {
                next = nextest;
                step++;
            }
        }
        return step;
    }
}
