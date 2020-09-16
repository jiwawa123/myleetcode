package com.ji.algo.pdd0901;

import java.util.Scanner;

/**
 * user ji
 * data 2020/9/1
 * time 6:58 下午
 */
public class G1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = n % 2 == 0;
        int avg = n / 2 - 1;
        if (!flag) {
            avg = n / 2;
        }

        int res[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || (i + j == n - 1) || (!flag && (i == avg || j == avg))) {
                    continue;
                }
                if (i <= avg && (n - i - 1) > j && j > avg) {
                    res[i][j] = 1;
                    continue;
                }

                if (i <= avg && j > i && j <= avg) {
                    res[i][j] = 2;
                    continue;
                }

                if (i <= avg && j > (n - i - 1) && j >= avg) {
                    res[i][j] = 8;
                    continue;
                }
                if (i <= avg && j < i) {
                    res[i][j] = 3;
                    continue;
                }


                if (i >= avg && j < (n - 1 - i) && j < avg) {
                    res[i][j] = 4;
                    continue;
                }

                if (i >= avg && j >= (n - i - 1) && j <= avg) {
                    res[i][j] = 5;
                    continue;
                }

                if (i >= avg && j > i) {
                    res[i][j] = 7;
                    continue;
                }
                if (i >= avg && j < i && j > avg) {
                    res[i][j] = 6;
                    continue;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
