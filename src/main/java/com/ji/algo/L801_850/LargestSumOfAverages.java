package com.ji.algo.L801_850;/*
    user ji
    data 2019/8/26
    time 5:48 PM
*/

public class LargestSumOfAverages {
    public static void main(String[] args) {

    }
    public double largestSumOfAverages(int[] A, int K) {
        /**
         dp[i][k]表示前i个数构成k个子数组时的最大平均值, 那么对于所有 0 <= j <= i-1
         dp[i][k] = Math.max(dp[i][k], dp[j][k-1] + (A[j+1] + ... + A[i+1]) / (i-j))
         **/
        double[][] dp = new double[A.length+1][K+1];
        // 额外记录一个sum数组保存到前i个数的和, 便于计算(A[j+1] + ... + A[i+1]) / (i-j)
        double[] sum = new double[A.length+1];

        for(int i = 1; i <= A.length; ++i) {
            sum[i] = sum[i-1] + A[i-1];
            dp[i][1] = sum[i] / i;
        }
        for(int i = 1; i <= A.length; ++i) {
            for(int k = 2; k <= K; ++k) {
                for(int j = 0; j < i; ++j) {
                    dp[i][k] = Math.max(dp[i][k], dp[j][k-1] + (sum[i]-sum[j]) / (i-j));
                }
            }
        }

        return dp[A.length][K];
    }
}
