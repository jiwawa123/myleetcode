package com.ji.algo.L401_450;/*
    user ji
    data 2019/5/4
    time 9:34 AM
*/

public class ArrangeCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(1804289383));
    }

    public static int arrangeCoins(int n) {
        if (n == 0)
            return n;
//        if (n <= 2)
//            return 1;
        int start = 1, end = n;
        while (start < end) {
            int med = start + (end - start) / 2;
            long tmp = (long)((long)(1 + med) * (med) / 2);
            if (tmp == n) {
                return med;
            } else if (tmp - med < n && tmp > n)
                return med - 1;
            else if (tmp < n && tmp + med + 1 > n) {
                return med;
            } else if (tmp > n)
                end = med - 1;
            else
                start = med + 1;
        }
        return start;
    }
}
