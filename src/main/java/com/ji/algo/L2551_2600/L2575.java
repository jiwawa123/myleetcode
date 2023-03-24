package com.ji.algo.L2551_2600;

/**
 * @Author: Bei Chang
 * @Date: 2023/03/11/下午7:22
 */
public class L2575 {
    public static void main(String[] args) {
        int[] arr = {10, 4, 8, 3};
        leftRigthDifference(arr);
    }

    public static int[] leftRigthDifference(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        int[] left = new int[len];
        int[] right = new int[len];
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                left[i] = 0;
            } else {
                left[i] = nums[i - 1] + left[i - 1];
            }
        }

        for (int i = len - 1; i >= 0; i--) {
            if (i == len - 1) {
                right[i] = 0;
            } else {
                right[i] = nums[i + 1] + right[i + 1];
            }
            res[i] = Math.abs(left[i] - right[i]);
        }


        return res;
    }

}
