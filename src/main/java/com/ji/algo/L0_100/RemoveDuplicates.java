package com.ji.algo.L0_100;/*
    user ji
    data 2019/4/8
    time 9:28 PM
*/

public class RemoveDuplicates {
    public static void main(String[] args) {

    }
    public static int removeDuplicates(int[] nums) {
        int len = 0;
        if(null==nums||nums.length==0)
            return len;
        nums[len++] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]!=nums[i-1]){
                nums[len++] = nums[i];
            }
        }
        return len;
    }
}
