package com.ji.algo.L1901_1950;

/**
 * user ji
 * data 2021/7/24
 * time 10:44 下午
 * @author ji
 */
public class L1920 {
    public static void main(String[] args) {

    }

    public int[] buildArray(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[nums[i]];
        }
        return arr;
    }
}
