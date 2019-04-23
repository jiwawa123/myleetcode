package com.ji.algo.L251_300;/*
    user ji
    data 2019/4/23
    time 8:53 PM
*/

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int index = 0;
        int count = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == 0) {
                count++;
            } else {
                nums[index] = nums[i];
            }
            i++;
        }
        for (int j = nums.length - count - 1; j < nums.length; j++) {
            nums[j] = 0;
        }
    }
}
