package com.ji.algo.L151_200;/*
    user ji
    data 2019/6/27
    time 6:31 PM
*/

public class Rotate {
    public static void main(String[] args) {

    }

    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k %= len;
        for (int i = 0; i < k; i++) {
            int tmp = nums[len - 1];
            for (int j = len - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = tmp;
        }
    }
}
