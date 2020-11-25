package com.ji.algo.G1115;

import java.util.Arrays;

/**
 * user ji
 * data 2020/11/15
 * time 10:20 下午
 */
public class G {
    public static void main(String[] args) {
        int arr[] = {2, 4, 9, 3};
        System.out.println(Arrays.toString(decrypt(arr, -2)));
    }

    public static int[] decrypt(int[] code, int k) {
        int len = code.length;
        int arr[] = new int[len];
        if (k == 0)
            return arr;
        for (int i = 0; i < len; i++) {
            if (k > 0) {
                for (int j = i + 1; j <= i + k; j++) {
                    arr[i] += code[(j + len) % len];
                }
            } else {
                for (int j = i - 1; j >= i + k; j--) {
                    arr[i] += code[(j + len) % len];
                }
            }
        }


        return arr;
    }
}
