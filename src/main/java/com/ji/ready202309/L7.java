package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/08/23:17
 */
public class L7 {
    public static void main(String[] args) {

    }

    public int reverse(int x) {
        boolean f = x > 0;
        x = Math.abs(x);
        long s = 0;
        while (x > 0) {
            s = s * 10 + x % 10;
            x /= 10;
        }
        if (!f) {
            s = -s;
        }
        if (s < Integer.MIN_VALUE || s > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) s;
    }
}
