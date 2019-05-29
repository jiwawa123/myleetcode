package com.ji.new_algo;/*
    user ji
    data 2019/5/29
    time 9:21 AM
*/

import java.util.Arrays;

public class HeadSort {
    public static void main(String[] args) {
        int arr[] = {5, 8, 3, 4, 6, 7, 1, 2, 12};
        head_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void heapify(int root, int len, int arr[]) {
        if (root >= len)
            return;
        int c1 = 2 * root + 1;
        int c2 = 2 * root + 2;
        int max = root;
        if (c1 < len && arr[max] < arr[c1]) {
            max = c1;
        }
        if (c2 < len && arr[max] < arr[c2]) {
            max = c2;
        }
        //如果发生改变就就发生交换并且从上到下发生运行
        if (max != root) {
            int tmp = arr[root];
            arr[root] = arr[max];
            arr[max] = tmp;
            heapify(max, len, arr);
        }
    }

    public static void build_heap(int arr[], int len) {
        int start = (len - 1) / 2;
        for (int i = start; i >= 0; i--) {
            heapify(i, len, arr);
        }
    }

    public static void head_sort(int arr[]) {
        build_heap(arr, arr.length);
        for (int i = arr.length - 1; i >= 0; i--) {
            int tmp = arr[i];
            arr[i] = arr[0];
            arr[0] = tmp;
            heapify(0, i, arr);
        }
    }
}
