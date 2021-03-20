package com.ji.algo.L1701_1750;

/**
 * user ji
 * data 2021/2/12
 * time 10:24 下午
 */
public class L1749 {
    public static void main(String[] args) {

    }

    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int[] sum = new int[n + 1];
        for (int i = 1; i <= n; i++) sum[i] = sum[i - 1] + nums[i - 1];

        int ans = 0;
        for (int i = 1, min = 0, max = 0; i <= n; i++) {
            ans = Math.max(ans, Math.abs(sum[i] - min));
            ans = Math.max(ans, Math.abs(sum[i] - max));
            max = Math.max(max, sum[i]);
            min = Math.min(min, sum[i]);
        }
        return ans;
    }
}
