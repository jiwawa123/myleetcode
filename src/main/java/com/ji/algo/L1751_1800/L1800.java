package com.ji.algo.L1751_1800;

/**
 * user ji
 * data 2021/3/24
 * time 9:01 上午
 */
public class L1800 {
    public static void main(String[] args) {

    }

    public int maxAscendingSum(int[] nums) {
        int res = nums[0];
        int tmp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                tmp += nums[i];
            } else {
                tmp = nums[i];
            }
            res = Math.max(res,tmp);
        }
        return res;
    }
}
