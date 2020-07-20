package com.ji.new_algo;

import java.util.Arrays;

/**
 * user ji
 * data 2020/7/17
 * time 10:56 上午
 */
public class HeadSortII {
    public static void main(String[] args) {
        int arr[] = {1, 8, 7, 2, 0, 1, 3, 4, 6, 10, 12};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void heapSort(int arr[]) {
        if (arr == null || arr.length < 1)
            return;
        build(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            swap(i, 0, arr);
            adjustHeap(0, i, arr);
        }
    }

    public static void build(int arr[]) {
        int start = (arr.length - 1) / 2;
        for (int i = start; i >= 0; i--) {
            adjustHeap(i, arr.length - 1, arr);
        }
    }


    public static void adjustHeap(int root, int len, int arr[]) {
        if (root > len)
            return;
        int c1 = 2 * root + 1;
        int c2 = 2 * root + 2;
        int max = root;
        if (c1 < len && arr[c1] > arr[max]) {
            max = c1;
        }
        if (c2 < len && arr[c2] > arr[max]) {
            max = c2;
        }
        if (max != root) {
            swap(max, root, arr);
            adjustHeap(max, len, arr);
        }
    }


    public static void swap(int i, int j, int arr[]) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
