package com.ji.algo.L3501_3550;

public class L3550 {
    public static void main(String[] args) {

    }

    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int t = 0;
            while (nums[i] > 0) {
                t += nums[i] % 10;
                nums[i] /= 10;
            }
            if (t == i) {
                return i;
            }
        }
        return -1;
    }
}
