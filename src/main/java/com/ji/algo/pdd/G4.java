package com.ji.algo.pdd;

import java.util.Scanner;

/**
 * user ji
 * data 2020/8/2
 * time 8:19 下午
 */
public class G4 {
    public static void main(String[] args) {
        int max = (int) (Math.pow(10, 9) + 7);
        Scanner sc = new Scanner(System.in);
        char[][] tmp = new char[6][6];
        for (int i = 0; i < 6; i++) {
            tmp[i] = sc.next().toCharArray();
        }
        long dp[][][] = new long[6][6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 || j == 0) {
                    if (i == 0 && j == 0) {
                        if (tmp[i][j] == '*')
                            continue;
                        for (int k = 0; k < 6; k++) {
                            dp[i][j][k] = 1;
                        }
                        continue;
                    }
                    if (i == 0) {
                        for (int k = 0; k < 6; k++) {
                            for (int l = 0; l < 6; l++) {
                                if (k != l) {
                                    dp[i][j][k] += dp[i][j - 1][l];
                                }
                            }
                        }
                        continue;
                    }
                    if (j == 0) {
                        for (int k = 0; k < 6; k++) {
                            for (int l = 0; l < 6; l++) {
                                if (k != l) {
                                    dp[i][j][k] += dp[i - 1][j][l];
                                }
                            }
                        }
                    }
                }
                if (tmp[i][j] == '*') {

                }
            }
        }


        long res = 0;
        for (int i = 0; i < 6; i++) {
            res += dp[5][5][i];
        }
        System.out.println(res % max);
    }
}
