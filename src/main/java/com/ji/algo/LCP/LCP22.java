package com.ji.algo.LCP;

import java.util.HashMap;
import java.util.Map;

/**
 * user ji
 * data 2020/11/22
 * time 9:12 上午
 */
public class LCP22 {
    public static void main(String[] args) {
        System.out.println(paintingPlan(2, 4));
    }

    public static int paintingPlan(int n, int k) {
        if (k == 0 || k == n * n)
            return 1;
        if (k < n || k > n * n) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (n * i + n * j - i * j == k) {
                    count += getCC(n, i) * getCC(n, j);
                }
            }
        }
        return count;
    }

    public static int getCC(int a, int b) {
        if (b == 0)
            return 1;
        int t1 = a;
        int t2 = b;
        for (int i = b - 1; i >= 1; i--) {
            t1 *= (a - (b - i));
            t2 *= i;
        }
        return t1 / t2;
    }
}
