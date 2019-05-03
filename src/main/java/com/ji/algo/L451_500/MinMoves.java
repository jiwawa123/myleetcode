package com.ji.algo.L451_500;/*
    user ji
    data 2019/5/3
    time 8:38 PM
*/

public class MinMoves {
    public static void main(String[] args) {

    }

    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i] - min;
        }
        return sum;
    }
}
