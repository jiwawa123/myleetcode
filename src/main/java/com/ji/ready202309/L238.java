package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/10/03/08:49
 */
public class L238 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        productExceptSelf(arr);
    }

    public static int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] left = new int[len + 1];
        left[0] = 1;
        int[] right = new int[len + 1];
        right[len] = 1;
        int[] arr = new int[len];
        for (int i = 1; i <= len; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }
        for (int i = len - 1; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i];
        }

        for (int i = 0; i < len; i++) {
            arr[i] = left[i] * right[i + 1];
        }
        return arr;
    }
}
