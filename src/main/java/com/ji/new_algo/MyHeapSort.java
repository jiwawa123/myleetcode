package com.ji.new_algo;/*
    user ji
    data 2019/9/23
    time 5:10 PM
*/

import java.util.Arrays;

public class MyHeapSort {
    public static void main(String[] args) {
        int arr[] = {10, 2, 3, 4, 16, 4, 7, 8, 13};
        help_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void help(int index, int len, int arr[]) {
        if (index > len)
            return;
        int l = index * 2 + 1;
        int r = index * 2 + 2;
        int tmp = index;
        if (l < len && arr[l] > arr[tmp]) {
            tmp = l;
        }
        if (r < len && arr[r] > arr[tmp]) {
            tmp = r;
        }
        //开始调整，同时自上而下
        if (tmp != index) {
            int inter = arr[tmp];
            arr[tmp] = arr[index];
            arr[index] = inter;
            help(tmp, len, arr);
        }
    }

    public static void help_build(int arr[], int len) {
        int index = arr.length / 2;
        for (int i = index; i >= 0; i--) {
            help(i, len, arr);
        }
    }

    public static void help_sort(int arr[]) {
        help_build(arr, arr.length - 1);
        for (int i = arr.length - 1; i >= 0; i--) {
            int tmp = arr[i];
            arr[i] = arr[0];
            arr[0] = tmp;
            help(0, i, arr);
        }
    }
}
