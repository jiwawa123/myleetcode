package com.ji.algo.tx;

import java.util.Scanner;

/**
 * user ji
 * data 2020/8/23
 * time 7:58 下午
 */
public class G3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            int val = sc.nextInt();
            if (val < 10) {
                System.out.println(val);
                continue;
            }
            help(val);
        }
    }

    public static void help(int n) {
        StringBuilder sp = new StringBuilder();
        sp.append(n);
        char arr[] = sp.reverse().toString().toCharArray();
        int dp[][] = new int[arr.length][2];
        for (int i = 0; i < arr.length - 1; i++) {
            if (i == 0) {
                // 表示不借位
                dp[i][0] = arr[i] - '0';
                // 表示借位
                int d = 10 + (arr[i] - '0');
                dp[i][1] = d / 2 + (d - d / 2);
            } else {
                // 判断
                int cur = arr[i] - '0';
                if (cur == 0) { // 特殊情况
                    dp[i][0] = 0;
                    // 向前借1
                    dp[i][1] = 10 + dp[i - 1][0];
                    dp[i][1] = Math.max(dp[i][1], 9 + dp[i - 1][1]);
                } else {
                    dp[i][0] = cur - 1 + dp[i - 1][1];
                    dp[i][0] = Math.max(dp[i][0], dp[i - 1][0]);
                    int d = 10 + cur;
                    dp[i][1] = d / 2 + (d - d / 2) + dp[i - 1][0];
                    d--;
                    dp[i][1] = Math.max(dp[i][1], d / 2 + (d - d / 2) + dp[i - 1][1]);
                }

            }
        }

        int last = arr[arr.length - 1] - '0';
        System.out.println(Math.max(dp[arr.length - 2][0] + last, dp[arr.length - 2][1] + last - 1));
    }


}
