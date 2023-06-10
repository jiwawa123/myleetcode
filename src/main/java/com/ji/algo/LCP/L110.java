package com.ji.algo.LCP;

import java.util.Arrays;

/**
 * @Author: Bei Chang
 * @Date: 2023/06/10/17:04
 */
public class L110 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 5};
        canPartition(arr);
    }

    public static boolean canPartition(int[] nums) {
        int sum = 0;
        for (int n : nums
        ) {
            sum += n;
        }
        int avg = 0;
        if (sum % 2 != 0) {
            return false;
        } else {
            avg = sum / 2;
        }
        boolean[][] flag = new boolean[nums.length][avg + 1];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > avg) {
                return false;
            }
            flag[i][nums[i]] = true;
            for (int j = 0; j < avg + 1; j++) {
                if (i > 0) {
                    flag[i][j] = flag[i - 1][j] || flag[i][j];
                }
                if (i > 0 && j >= nums[i]) {
                    flag[i][j] = flag[i][j] || flag[i - 1][j - nums[i]];
                }

            }
        }
        return flag[nums.length - 1][avg];
    }
}
