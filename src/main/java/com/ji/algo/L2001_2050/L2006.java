package com.ji.algo.L2001_2050;

/**
 * @author ji
 * @data 2021/10/10
 * @time 10:05 下午
 */
public class L2006 {
    public static void main(String[] args) {

    }

    public int countKDifference(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
