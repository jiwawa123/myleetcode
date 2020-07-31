package com.ji.interview.ali;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * user ji
 * data 2020/7/31
 * time 6:55 下午
 */
public class G1 {
    static int max = (int) Math.pow(10, 9) + 7;
    static long arr[];
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        long res = 1;
        arr = new long[n + 1];
        arr[1] = n;
        arr[n] = 1;
        int next = 1;
        for (int i = 1; i <= n; i++) {
            next *= m;
            next %= max;
            if (i == 9) {
                System.out.println(next);
                System.out.println(cc(1000, 9));
            }
            res += cc(n, i) % max * next % max;
            if (res < 0) {
                System.out.println(i + " " + res);
            }
            res %= max;
        }
        System.out.println((int) res);

    }

    public static double cc(int a, int b) {
        if (arr[b] != 0)
            return arr[b];
        long min = Math.min(b, a - b);
        long tmp = 1;
        long k = min;
        for (int i = a; i > a - min; i--) {
            tmp = tmp % max * i % max / (k--) % max;
            tmp %= max;
        }
        arr[b] = arr[n + 1 - b] = tmp % max;
        if (arr[b] < 0) {
            System.out.println(tmp);
            System.out.println(b + " " + arr[b]);
        }


        return arr[b] % max;
    }
}
