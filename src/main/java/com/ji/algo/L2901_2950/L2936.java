package com.ji.algo.L2901_2950;

/**
 * @Author: Bei Chang
 * @Date: 2023/12/12/09:59
 */
public class L2936 {
    public static void main(String[] args) {
        System.out.println(10 ^ 100);
    }

    public int maximumStrongPairXor(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                res = Math.max(res, nums[i] ^ nums[j]);
            }
        }
        return res;
    }
}
