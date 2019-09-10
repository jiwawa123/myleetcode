package com.ji.algo.L351_400;/*
    user ji
    data 2019/9/10
    time 8:59 AM
*/

import java.util.Arrays;

public class RangeAddition {
    public static void main(String[] args) {
        int arr[][] = {{0, 2, -2}};
        System.out.println(Arrays.toString(rangeAddition(3, arr)));
    }

    public static int[] rangeAddition(int n, int arr[][]) {
        int res[] = new int[n];
        for (int a[] : arr) {
            res[a[0]] += a[2];
            if (a[1] != n - 1) {
                res[a[1] + 1] -= a[2];
            }
        }
        for (int i = 1; i < res.length; ++i) {
            res[i] += res[i - 1];
        }
        return res;
    }
}
