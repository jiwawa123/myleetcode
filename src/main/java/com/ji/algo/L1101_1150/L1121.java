package com.ji.algo.L1101_1150;

import java.util.*;

/**
 * user ji
 * data 2020/11/14
 * time 9:22 下午
 */
public class L1121 {
    public static void main(String[] args) {

    }

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            map.put(arr1[i], i);
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length - i - 1; j++) {
                int l = map.getOrDefault(arr1[j], -1);
                int r = map.getOrDefault(arr1[j + 1], -1);
                int max = Math.max(arr1[j], arr1[j + 1]);
                int min = Math.min(arr1[j], arr1[j + 1]);
                if (l == r) {
                    arr1[j + 1] = max;
                    arr1[j] = min;
                    continue;
                }

                if (l > r) {
                    int tmp = arr1[j + 1];
                    arr1[j + 1] = arr1[j];
                    arr1[j] = tmp;
                }
            }
        }
        return arr1;
    }
}
