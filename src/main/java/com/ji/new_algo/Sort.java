package com.ji.new_algo;/*
    user ji
    data 2019/9/19
    time 8:22 AM
*/

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int arr[] = {5, 5, 1, 0, 20, 99, 2, 10, 5, 1, 3, 4, 3, 1, 8, 4, 7, 6};
        quick_sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quick_sort(int arr[], int start, int end) {
        if (start >= end)
            return;
        int tmp = arr[start];
        int i = start, j = end;
        while (i < j) {
            while (i < j && tmp <= arr[j]) {
                j--;
            }

            while (i < j && tmp >= arr[i]) {
                i++;
            }
            if (i < j) {
                int inter = arr[i];
                arr[i] = arr[j];
                arr[j] = inter;
            }
        }
        arr[start] = arr[i];
        arr[i] = tmp;
        quick_sort(arr, start, i - 1);
        quick_sort(arr, i + 1, end);
    }
}
