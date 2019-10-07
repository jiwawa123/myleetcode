package com.ji.algo.game;/*
    user ji
    data 2019/10/7
    time 9:21 AM
*/

import java.util.ArrayList;
import java.util.List;

public class ArraysIntersection {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int arr1[] = {1, 3, 5};
        int arr2[] = {1, 2, 3};
        arraysIntersection(arr, arr1, arr2).stream().forEach(System.out::println);
    }

    public static List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> list = new ArrayList<>();
        if (arr1.length == 0 || arr2.length == 0 || arr3.length == 0)
            return list;

        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            //如果三者相等即可添加到list里面
            int min = Math.min(arr1[i], Math.min(arr2[j], arr3[k]));
            if (min == arr1[i] && min == arr2[j] && min == arr3[k]) {
                list.add(min);
                i++;
                j++;
                k++;
                continue;
            }
            if (arr1[i] == min) {
                i++;
            }
            if (arr2[j] == min) {
                j++;
            }
            if (arr3[k] == min) {
                k++;
            }
        }
        return list;
    }
}
