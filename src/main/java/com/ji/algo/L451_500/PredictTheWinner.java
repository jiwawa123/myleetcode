package com.ji.algo.L451_500;/*
    user ji
    data 2019/5/5
    time 9:15 PM
*/

public class PredictTheWinner {

    public boolean PredictTheWinner(int[] nums) {
        if(nums.length%2==0)
            return true;
        int sum = 0;
        for(int n : nums)
            sum += n;
        int len = nums.length;
        int[][] dp = new int[len][len];
        for(int i = 0; i < len; i++)
            dp[i][i] = nums[i];
        for(int j = 1; j < len; j++)
            dp[j-1][j] = Math.max(dp[j-1][j-1], dp[j][j]);
        // 按照对角线来递推
        for(int i = 2; i < len; i++)
            for(int row = 0; i + row < len; row++)
                dp[row][row+i]  = Math.max(nums[row] + Math.min(dp[row+1][i+row-1], dp[row+2][i+row]),
                        nums[i+row] + Math.min(dp[row][i+row-2], dp[row+1][i+row-1]));
        return dp[0][len-1] >= (sum - dp[0][len-1]);
    }
}
