package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/10/10:12
 */
public class LO42 {
    public static void main(String[] args) {

    }

    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int now = Integer.MIN_VALUE;
        for (int t : nums
        ) {
            if (t > (t + now)) {
                now = t;
            } else {
                now += t;
            }
            max = Math.max(max, now);

        }

        return max;
    }
}
