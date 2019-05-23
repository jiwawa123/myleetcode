package com.ji.algo.L951_1000;/*
    user ji
    data 2019/5/23
    time 11:13 PM
*/

import java.util.Arrays;

public class SortedSqure {
    public static void main(String[] args) {
        int arr[]  = {-4,-3,-2};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }

    public static  int[] sortedSquares(int[] A) {
        int index = -1;
        int arr[] = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            for (int i = 0; i < A.length; i++) {
                arr[i] = A[i] * A[i];
            }
        } else {
            int len = 0;
            int i = index - 1;
            while (i >= 0 && index < A.length) {
                if (A[i] * A[i] > A[index] * A[index]) {
                    arr[len++] = A[index] * A[index];
                    index++;
                } else {
                    arr[len++] = A[i] * A[i];
                    i--;
                }
            }
            while (i >= 0) {
                arr[len++] = A[i] * A[i];
                i--;
            }
            while (index < A.length) {
                arr[len++] = A[index] * A[index];
                index++;
            }
        }

        return arr;
    }
}
