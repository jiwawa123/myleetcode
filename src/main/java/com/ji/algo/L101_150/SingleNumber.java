package com.ji.algo.L101_150;/*
    user ji
    data 2019/4/15
    time 4:23 PM
*/

public class SingleNumber {
    public static void main(String[] args) {

    }
    public int singleNumber(int[] nums) {
        int sum = 0;
        for(int i = 0;i<nums.length;i++)
            sum ^= nums[i];
        return sum;
    }
}
