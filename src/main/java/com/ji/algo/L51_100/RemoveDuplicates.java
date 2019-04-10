package com.ji.algo.L51_100;/*
    user ji
    data 2019/4/10
    time 8:03 AM
*/

public class RemoveDuplicates {
    public static void main(String[] args) {

    }

    public int removeDuplicates(int[] nums) {
        int len = 0;
        int count = 0;
        if (null == nums || nums.length <= 2)
            return nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
                if (nums[i] == nums[i - 1]) {
                    count++;
                    if (count <= 2) {
                        nums[len++] = nums[i];
                    }
                } else {
                    nums[len++] = nums[i];
                    count = 1;
                }
            } else {
                nums[len++] = nums[i];
                count = 1;
            }
        }
        return len;
    }
}
