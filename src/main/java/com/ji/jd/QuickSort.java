package com.ji.jd;

import java.util.Arrays;

/**
 * user ji
 * data 2020/7/15
 * time 2:50 下午
 */
public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 1, 0};
        quickSort(0, arr.length - 1, arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void quickSort(int start, int end, int arr[]) {
        if (start >= end) {
            return;
        }
        int i = start, j = end;
        int tmp = arr[start];
        while (i < j) {
            while (i < j && arr[i] <= arr[j]) {
                j--;
            }
            arr[i] = arr[j];
            while (i < j && arr[i] <= arr[j]) {
                i++;
            }
            arr[j] = arr[i];
        }
        arr[i] = tmp;
        quickSort(start, i - 1, arr);
        quickSort(i + 1, end, arr);
    }
}
