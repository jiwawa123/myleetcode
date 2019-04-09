package com.ji.algo.L51_100;/*
    user ji
    data 2019/4/9
    time 5:03 PM
*/

public class MySqrt {
    public static void main(String[] args) {
        mySqrt(10);
    }

    public static int mySqrt(int x) {
        if (x <= 1)
            return x;
        if (x <= 3)
            return 1;
        for (long i = 2; i <= x / 2; i++) {
            long kk = i * i;
            if (kk == x)
                return (int) i;
            if (kk > x)
                return (int) (i - 1);
        }
        return 0;
    }

    //这还是一个二分的过程，直接使用二分查找即可，注意这个过程中med需要用long来存储
    public int mySqrtII(int x) {
        long i = 0, j = x;
        while (i <= j) {
            long mid = (i + j) / 2;
            if (mid * mid == x) {
                return (int) mid;
            } else if (mid * mid < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return (int) j;
    }
}
