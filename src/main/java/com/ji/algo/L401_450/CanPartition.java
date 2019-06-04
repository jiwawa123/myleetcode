package com.ji.algo.L401_450;/*
    user ji
    data 2019/6/4
    time 4:09 PM
*/

public class CanPartition {
    public static void main(String[] args) {

    }

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum % 2 != 0)
            return false;
        int avarge = sum / 2;
        boolean dp[][] = new boolean[nums.length + 1][avarge + 1];
        for (int i = 0; i < nums.length + 1; i++) {
            dp[i][0] = true;
        }
        for (int i = 1; i < avarge + 1; i++) {
            dp[0][i] = false;
        }
        for (int i = 1; i < nums.length + 1; i++) {
            for (int j = 1; j < avarge + 1; j++) {
                if (dp[i - 1][j]) {
                    dp[i][j] = true;
                    continue;
                }
                if (j >= nums[i - 1] && dp[i - 1][j - nums[i - 1]]) {
                    dp[i][j] = true;
                    continue;
                }
            }
        }

        return dp[nums.length][avarge];
    }
}
