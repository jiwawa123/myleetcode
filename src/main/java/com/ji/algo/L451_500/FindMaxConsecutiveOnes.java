package com.ji.algo.L451_500;/*
    user ji
    data 2019/5/5
    time 9:07 PM
*/

public class FindMaxConsecutiveOnes {
    public static void main(String[] args) {

    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                len++;
            } else {
                max = Math.max(max, len);
                len = 0;
            }
        }
        return Math.max(max,len);
    }
}
