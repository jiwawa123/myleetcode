package com.ji.algo.game;/*
    user ji
    data 2019/10/20
    time 9:26 AM
*/

public class ProbabilityOfHeads {
    public static void main(String[] args) {
        double p[] = {0.5, 0.5, 0.5, 0.5, 0.5};
        System.out.println(probabilityOfHeads(p, 0));
    }

    public static double probabilityOfHeads(double[] prob, int target) {
        int len = prob.length;
        double dp[][] = new double[len][target + 1];
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                dp[i][0] = 1 - prob[0];
                if (target > 0)
                    dp[i][1] = prob[0];
                continue;
            }
            for (int j = 0; j < target + 1; j++) {
                if (j == 0) {
                    dp[i][0] = dp[i - 1][0] * (1 - prob[i]);
                    continue;
                }
                dp[i][j] = dp[i - 1][j] * (1 - prob[i]) + dp[i - 1][j - 1] * prob[i];

            }
        }
        return dp[len - 1][target];

    }
}
