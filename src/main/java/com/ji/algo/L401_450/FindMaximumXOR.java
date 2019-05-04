package com.ji.algo.L401_450;/*
    user ji
    data 2019/5/4
    time 9:33 AM
*/

public class FindMaximumXOR {
    public static void main(String[] args) {

    }
    public int findMaximumXOR(int[] nums) {
        int min = 0;
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                min = Math.max(min,nums[i]^nums[j]);
            }
        }
        return min;
    }
}
