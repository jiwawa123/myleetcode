package com.ji.algo.G0614;

import java.util.Arrays;

/**
 * user ji
 * data 2020/6/14
 * time 10:17 上午
 */
public class G3 {
    public static void main(String[] args) {
        int arr[] = {1, 10, 3, 10, 2};
        System.out.println(minDays(arr, 3, 1));
    }

    public static int minDays(int[] bloomDay, int m, int k) {
        if (m * k > bloomDay.length)
            return -1;
        if (k == 1) {

        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < bloomDay.length; i++) {
            for (int j = 0; j < k; j++) {
                int l = minDays(Arrays.copyOfRange(bloomDay, 0, j), m, j + 1);
                if (l == -1)
                    continue;
                int r = minDays(Arrays.copyOfRange(bloomDay, j + 1, bloomDay.length), m, k - j - 1);
                if (r == -1)
                    continue;
                int inter = Math.min(l, r);
                res = Math.min(res, inter);
            }
        }
        return res;
    }

    public static int getMin(int arr[]) {
        int res = arr[0];
        for (int t : arr
        ) {
            res = Math.min(res, t);
        }
        return res;
    }
}
