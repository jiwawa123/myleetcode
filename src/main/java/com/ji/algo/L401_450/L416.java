package com.ji.algo.L401_450;

import java.util.Arrays;

/**
 * user ji
 * data 2020/10/11
 * time 11:19 下午
 */
public class L416 {
    public static void main(String[] args) {
        int arr[] = {1, 5, 11, 5};
        System.out.println(canPartition(arr));
    }

    public static boolean canPartition(int[] nums) {
        int sum = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            sum += nums[i];
        }
        if (sum % 2 == 1)
            return false;
        int avg = sum / 2;

        boolean dp[][] = new boolean[nums.length + 1][avg + 1];
        dp[0][0] = true;
        for (int i = 1; i < len + 1; i++) {
            for (int j = 0; j < avg; j++) {
                if (dp[i - 1][j]) {
                    if (nums[i - 1] + j == avg)
                        return true;
                    dp[i][j] = true;
                    if (nums[i - 1] + j > avg)
                        continue;
                    dp[i][j + nums[i - 1]] = true;
                }
            }
        }

        return false;
    }
}
