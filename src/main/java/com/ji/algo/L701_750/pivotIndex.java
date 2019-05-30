package com.ji.algo.L701_750;/*
    user ji
    data 2019/5/30
    time 3:57 PM
*/

public class pivotIndex {
    public static void main(String[] args) {

    }

    public int pivotIndex(int[] nums) {
        if (nums == null)
            return -1;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += nums[i];
        }
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count - nums[i] == left * 2)
                return i;
            left += nums[i];
        }
        return -1;
    }
}
