package com.ji.new_algo;/*
    user ji
    data 2019/9/23
    time 5:35 PM
*/

import java.util.Arrays;

public class My_Merage {
    public static void main(String[] args) {
        int arr[] = {0, 2, 3, 4, 1, 2, 3, 4, 6};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int arr[], int low, int high) {
        if (low >= high)
            return;
        int med = (high - low) / 2 + low;
        sort(arr, low, med);
        sort(arr, med + 1, high);
        merage(arr, low, med, high);
    }

    public static void merage(int arr[], int low, int med, int high) {
        int tmp[] = new int[high - low + 1];
        int k = 0;
        int i = low;
        int j = med + 1;
        while (i <= med && j <= high) {
            if (arr[i] < arr[j]) {
                tmp[k++] = arr[i++];
            } else {
                tmp[k++] = arr[j++];
            }
        }
        while (i <= med) {
            tmp[k++] = arr[i++];
        }
        while (j <= high) {
            tmp[k++] = arr[j++];
        }
        for (int l = 0; l < k; l++) {
            arr[low + l] = tmp[l];
        }
    }
}
