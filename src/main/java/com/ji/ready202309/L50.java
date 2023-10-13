package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/22/20:27
 */
public class L50 {
    public static void main(String[] args) {

    }

    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        long t = n;
        return help(x, n);
    }


    public double help(double x, long n) {
        if (n == 0) {
            return 1;
        }

        double h = help(x, n / 2);
        if (n % 2 == 0) {
            return h * h;
        }
        return h * h * x;
    }
}
