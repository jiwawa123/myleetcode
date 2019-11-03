package com.ji.algo.game.G1103;/*
    user ji
    data 2019/11/3
    time 5:20 PM
*/

import java.util.ArrayList;
import java.util.List;

public class L5096 {
    public static void main(String[] args) {
        int arr[] = {6, 2, 3, 4};
        transformArray(arr).stream().forEach(System.out::println);
    }

    public static List<Integer> transformArray(int[] arr) {
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        int count = 0;
        int arr1[] = new int[arr.length];
        arr1[0] = arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                list.add(arr[i] - 1);
                arr1[i] = arr[i] - 1;
            } else if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
                list.add(arr[i] + 1);
                arr1[i] = arr[i] + 1;
            } else {
                list.add(arr[i]);
                arr1[i] = arr[i];
            }
            if (list.get(i) == arr[i])
                count++;
        }
        arr1[arr.length - 1] = arr[arr.length - 1];
        if (count == arr.length - 2) {
            list.add(arr[arr.length - 1]);
            return list;
        }
        return transformArray(arr1);
    }

}
