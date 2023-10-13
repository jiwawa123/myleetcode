package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/10/10:29
 */
public class L55 {
    public static void main(String[] args) {

    }

    public boolean canJump(int[] nums) {

        int next = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (next < i) {
                return false;
            } else {
                next = Math.max(next, i + nums[i]);
            }
        }
        return true;
    }
}
