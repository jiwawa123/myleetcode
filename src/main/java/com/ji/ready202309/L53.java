package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/06/22:19
 */
public class L53 {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] nums) {
        long max = Integer.MIN_VALUE;
        long len = Integer.MIN_VALUE;
        for (int n : nums) {
            if ((len + n) < n) {
                len = n;
            } else {
                len += n;
            }
            max = Math.max(max, len);
        }
        return (int)max;

    }
}
