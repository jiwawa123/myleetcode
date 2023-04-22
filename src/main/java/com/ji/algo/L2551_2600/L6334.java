package com.ji.algo.L2551_2600;

/**
 * @Author: Bei Chang
 * @Date: 2023/04/16/11:33
 */
public class L6334 {
    public static void main(String[] args) {

    }

    public long[] findPrefixScore(int[] nums) {
        long max = 0;
        int len = nums.length;
        long[] res = new long[len];
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                max = nums[i];
                res[i] = max * 2;
            } else {
                max = Math.max(max, nums[i]);
                res[i] = res[i - 1] + nums[i] + max;
            }

        }


        return res;

    }
}
