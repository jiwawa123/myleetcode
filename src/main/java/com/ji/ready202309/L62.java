package com.ji.ready202309;

import java.util.Arrays;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/09/23:42
 */
public class L62 {
    public int uniquePaths(int m, int n) {
        int[] arr = new int[n];
        Arrays.fill(arr, 1);
        for (int i = 1; i < m; i++) {
            int[] tmp = new int[n];
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    tmp[j] = 1;
                } else {
                    tmp[j] = tmp[j - 1] + arr[j];
                }
            }
            arr = tmp;
        }

        return arr[n - 1];
    }
}
