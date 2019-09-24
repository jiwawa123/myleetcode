package com.ji.new_algo;/*
    user ji
    data 2019/9/23
    time 5:20 PM
*/

import java.util.Arrays;

public class MyQuick_Sort {
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 4, 1, 2, 7, 2, 8, 0, 10};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int arr[], int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int tmp = arr[start];
        while (i < j) {
            while (i < j && tmp <= arr[j]) {
                j--;
            }
            while (i < j && tmp >= arr[i]) {
                i++;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        arr[start] = arr[i];
        arr[i] = tmp;
        sort(arr, i + 1, end);
        sort(arr, start, i - 1);
    }

    public static void swap(int arr[], int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
