package com.ji.algo.L0_50;/*
    user ji
    data 2019/4/8
    time 9:36 PM
*/

public class RemoveElement {


    public static void main(String[] args) {

    }

    public int removeElement(int[] nums, int val) {
        int len = 0;
        if (nums == null || nums.length == 0)
            return len;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[len++] = nums[i];
            }
        }
        return len;
    }
}
