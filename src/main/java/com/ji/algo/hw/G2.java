package com.ji.algo.hw;

import java.util.Scanner;

/**
 * user ji
 * data 2020/8/19
 * time 7:32 下午
 */
public class G2 {
    static int max = (int) (Math.pow(10, 9) + 7);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int arr[] = new int[m];
        int dep = 0;
        for (int i = 0; i < m; i++) {
            int t = sc.nextInt();
            if (t < 0 || t >= m) {
                System.out.println(0);
                return;
            }
            dep = Math.max(dep, t);
            arr[t] += 1;
        }

        for (int i = 0; i <= dep; i++) {
            if (arr[i] == 0 || arr[i] > (Math.pow(2, i))) {
                System.out.println(0);
                return;
            }
            if (i > 0) {
                if (arr[i] > arr[i - 1] * 2) {
                    System.out.println(0);
                    return;
                }
            }
        }
        long last = 1;
        for (int i = 1; i <= dep; i++) {

            if (arr[i] == arr[i - 1] * 2)
                continue;
            last *= help(arr[i - 1] * 2, arr[i]) % max;
            last %= max;
        }
        System.out.println(last % max);
    }

    public static long help(long n, long m) {
        long a = 1;
        long b = 1;
        for (int i = 1; i <= n; i++) {
            if (i > n - m) {
                a *= i;
                a %= max;
            }
            if (i <= m) {
                b *= i;
                b %= max;
            }
        }
        return (a % max) / (b % max);
    }
}
