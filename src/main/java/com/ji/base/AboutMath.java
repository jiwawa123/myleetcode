package com.ji.base;/*
    user ji
    data 2019/6/15
    time 9:05 AM
*/

import java.util.Arrays;

public class AboutMath {
    public int countPrimes(int n) {

        boolean arr[] = new boolean[n];
        int count = 0;
        Arrays.fill(arr, true);
        for (int i = 2; i < n; i++) {
            if (arr[i]) {
                for (int j = 2 * i; j < n; j += i) {
                    arr[j] = false;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            count += arr[i] ? 1 : 0;
        }
        return count;
    }
}
