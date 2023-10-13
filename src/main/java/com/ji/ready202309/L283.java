package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/09/23:55
 */
public class L283 {
    public static void main(String[] args) {

    }

    public void moveZeroes(int[] nums) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                n++;
            } else {
                nums[i - n] = nums[i];
            }
        }
        for (int i = n - 1; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
