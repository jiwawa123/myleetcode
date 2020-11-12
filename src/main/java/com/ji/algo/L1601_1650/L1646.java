package com.ji.algo.L1601_1650;

/**
 * user ji
 * data 2020/11/12
 * time 8:59 下午
 */
public class L1646 {
    public static void main(String[] args) {

    }

    public int getMaximumGenerated(int n) {
        int arr[] = new int[n];
        int max = 0;
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0)
                arr[i] = arr[i / 2];
            else
                arr[i] = arr[i / 2] + arr[i / 2 + 1];
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}
