package com.ji.algo.L701_750;/*
    user ji
    data 2019/5/12
    time 10:16 PM
*/

public class DominantIndex {
    public static void main(String[] args) {

    }

    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                index = i;
                max = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0||i==index)
                continue;
            if (max / nums[i] < 2)
                return -1;
        }
        return index;
    }
}
