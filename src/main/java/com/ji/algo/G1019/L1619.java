package com.ji.algo.G1019;

import java.util.Arrays;

/**
 * user ji
 * data 2020/10/19
 * time 10:22 上午
 */
public class L1619 {
    public static void main(String[] args) {

    }

    public double trimMean(int[] arr) {

        int len = arr.length;
        if (len == 0)
            return 0;
        int l = (int) (1.0 * len * 0.05);
        int r = (int) (1.0 * len * 0.95);
        int sum = 0;
        Arrays.sort(arr);
        for (int i = l; i < r; i++) {
            sum += arr[i];
        }
        return sum * 1.0 / (r - l);
    }
}
