package com.ji.algo.offer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Bei Chang
 * @Date: 2022/01/29/上午11:07
 */
public class O74 {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19}, arr2 = {2, 1, 4, 3, 9, 6};
        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            map.put(arr2[i], i);
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 7) {
                System.out.println("");
            }
            for (int j = i + 1; j < arr1.length; j++) {
                if (!map.containsKey(arr1[i])) {
                    if (map.containsKey(arr1[j]) || arr1[i] > arr1[j]) {
                        swap(i, j, arr1);
                    }
                } else {
                    if (map.containsKey(arr1[j]) && map.get(arr1[i]) > map.get(arr1[j])) {
                        swap(i, j, arr1);
                    }
                }
            }
        }
        return arr1;
    }

    public static void swap(int i, int j, int[] res) {
        int tmp = res[i];
        res[i] = res[j];
        res[j] = tmp;
    }
}
