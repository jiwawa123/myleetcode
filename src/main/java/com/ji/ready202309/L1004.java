package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/07/19:17
 */
public class L1004 {
    public static void main(String[] args) {

    }

    public int longestOnes(int[] nums, int k) {
        int res = 0;
        int sum = 0;
        for (int left = 0, right = 0; right < nums.length; ) {
            sum += nums[right++] == 0 ? 1 : 0;
            while (sum > k) {
                sum -= nums[left++] == 0 ? 1 : 0;
            }
            res = Math.max(res, right - left);
        }
        return res;
    }
}
