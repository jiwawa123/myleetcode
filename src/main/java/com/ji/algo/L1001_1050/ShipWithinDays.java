package com.ji.algo.L1001_1050;/*
    user ji
    data 2019/8/22
    time 9:36 AM
*/

public class ShipWithinDays {
    public static void main(String[] args) {
        int arr[] = {3, 2, 2, 4, 1, 4};
        shipWithinDays(arr,3);
    }

    public static int shipWithinDays(int[] weights, int D) {
        int sum = 0, max = 0;
        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];
            if (weights[i] > max) {
                max = weights[i];
            }
        }
        int l = max, r = sum;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (judge(weights, m, D)) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    public static boolean judge(int[] w, int x, int D) {
        int j = 1;
        int cur = 0;
        for (int i = 0; i < w.length; i++) {
            if (cur + w[i] <= x) {
                cur += w[i];
            } else {
                j++;
                cur = w[i];
            }
            if (j > D) {
                return false;
            }
        }
        return true;
    }
}
