package com.ji.algo.game;/*
    user ji
    data 2019/9/24
    time 2:08 PM
*/

public class UglyNth {
    public static void main(String[] args) {
        System.out.println(lcm(2, 3));
    }

    static long gcd(long a, long b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    static int count(int num, int a, int b, int c) {
        return (int) (num / a + num / b + num / c
                - num / lcm(a, b)
                - num / lcm(b, c)
                - num / lcm(a, c)
                + num / (lcm(a, lcm(b, c))));
    }

    public static int nthUglyNumber(int n, int a, int b, int c) {
        int left = 0, right = Integer.MAX_VALUE, result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (count(mid, a, b, c) >= n) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }
}
