package com.ji.algo.game;/*
    user ji
    data 2019/10/13
    time 11:07 AM
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class L3 {
    public static void main(String[] args) {

    }

    public int dieSimulator(int n, int[] rollMax) {
        int[][][] dp = new int[n + 1][6][20];
        int mod = 1000000007;
        for(int i = 0;i < 6;i++){
            dp[0][i][1] = 1;
        }
        for(int i = 1;i < n;i++){
            for(int j = 0;j < 6;j++){
                for(int k = 0;k < 6;k++){
                    if(j != k){
                        for(int l = 1;l <= rollMax[k];l++){
                            //i表示第i次掷骰子
                            //j表示掷的点数为j
                            //l表示点数j连续的个数
                            //dp[i][j][l]表示第i次投掷骰子，所得点数为j且连续的个数为l的种数。
                            dp[i][j][1] += dp[i - 1][k][l];
                            dp[i][j][1] %= mod;
                        }
                    }else{
                        for(int l = 1;l < rollMax[k];l++){
                            //i表示第i次掷骰子
                            //j表示掷的点数为j
                            //l表示点数j连续的个数
                            dp[i][j][l + 1] += dp[i - 1][k][l];
                            dp[i][j][l + 1] %= mod;
                        }
                    }
                }
            }
        }
        int ans = 0;
        for(int j = 0;j < 6;j++){
            for(int k = 1;k <= rollMax[j];k++){
                ans += dp[n - 1][j][k];
                ans %= mod;
            }
        }
        return ans;
    }
}
