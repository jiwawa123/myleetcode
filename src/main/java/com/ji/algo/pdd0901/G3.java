package com.ji.algo.pdd0901;

import java.util.Scanner;

/**
 * user ji
 * data 2020/9/1
 * time 6:58 下午
 */
public class G3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int dp[][] = new int[n + 1][m + 1];
        int w[] = new int[n];
        int v[] = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (w[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i - 1]] + v[i - 1]);
                }
            }
        }
        System.out.println(dp[n][m]);
    }
}
