package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/29/21:01
 */
public class L42 {
    public static void main(String[] args) {

    }


    public int trap(int[] height) {
        if (null == height || height.length < 2) {
            return 0;
        }

        int len = height.length;
        int[] left = new int[len];
        int[] right = new int[len];
        int sum = 0;
        left[0] = height[0];
        right[len - 1] = height[len - 1];
        for (int i = 1; i < len; i++) {
            left[i] = Math.max(height[i], left[i - 1]);
        }
        for (int i = len - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i]);
        }

        for (int i = 0; i < len; i++) {
            sum += Math.max((Math.min(left[i], right[i])) - height[i], 0);
        }

        return sum;


    }
}
