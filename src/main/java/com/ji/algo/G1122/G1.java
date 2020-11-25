package com.ji.algo.G1122;

import java.util.Arrays;

/**
 * user ji
 * data 2020/11/22
 * time 6:10 下午
 */
public class G1 {
    public static void main(String[] args) {
        System.out.println(getSmallestString(3,27));
    }

    public static String getSmallestString(int n, int k) {
        int arr[] = new int[n];
        int avg = k / n;
        int last = k - avg * n;
        Arrays.fill(arr, avg);
        arr[n - 1] += last;
        int i = 0, j = n - 1;
        while (i < j) {
            if (arr[i] == 1) {
                i++;
            }
            if (arr[j] == 26) {
                j--;
            }
            if (arr[i] - 1 <= 26 - arr[j]) {
                arr[j] = arr[j] + (arr[i] - 1);
                arr[i] = 1;
                i++;
            }else{
                arr[i] -= (26 - arr[j]);
                arr[j] = 26;
                j--;
            }
        }
        StringBuilder sp = new StringBuilder();
        for (int l = 0; l < n; l++) {
            sp.append((char)('a' + (arr[l] - 1)));
        }
        return sp.toString();
    }
}
