package com.ji.algo.game;/*
    user ji
    data 2019/9/15
    time 12:33 PM
*/

public class KConcatenationMaxSum {
    public static void main(String[] args) {

    }

    public int kConcatenationMaxSum(int[] arr, int k) {
        int max = 0;
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res += arr[i];
            if (res < 0) {
                res = 0;
            }
            max = Math.max(res, max);
        }
        if (k == 1) {
            return max;
        } else {
            int all = 0;
            for (int i = 0; i < arr.length; i++) {
                all += arr[i];
                res += arr[i];
                if (res < 0) {
                    res = 0;
                }
                max = Math.max(res, max);
            }
            if (all < 0) {
                return max;
            }
            return (int) (((long) max + (long) all * ((long) k - 2)) % 1000000007);
        }
    }
}
