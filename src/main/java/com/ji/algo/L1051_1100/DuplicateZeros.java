package com.ji.algo.L1051_1100;/*
    user ji
    data 2019/6/27
    time 7:00 PM
*/

import java.util.Arrays;

public class DuplicateZeros {
    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr);
    }


    public static void duplicateZeros(int[] arr) {
        int tmp[] = new int[arr.length];
        for (int i = 0, j = 0; i < arr.length && j < arr.length; i++) {
            if (arr[i] == 0) {
                if (j > arr.length - 1)
                    break;
                arr[j++] = 0;
                if (j > arr.length - 1)
                    break;
                arr[j++] = 0;
            } else {
                if (j > arr.length - 1)
                    break;
                tmp[j++] = arr[i];
            }

        }
        for (int i = 0; i < tmp.length; i++) {
            arr[i] = tmp[i];
        }
    }
}
