package com.ji.algo.L951_1000;/*
    user ji
    data 2019/6/28
    time 8:53 PM
*/

import java.util.ArrayList;
import java.util.List;

public class IntervalIntersection {
    public static void main(String[] args) {
        int arr[][] = {{0, 2}, {5, 10}, {13, 23}, {24, 25}};
        int b[][] = {{1, 5}, {8, 12}, {15, 24}, {25, 26}};
        intervalIntersection(arr, b);
    }

    public static int[][] intervalIntersection(int[][] A, int[][] B) {
        int i = 0;
        int j = 0;
        List<int[]> list = new ArrayList<>();
        while (i < A.length && j < B.length) {
            int ta[] = A[i];
            int tb[] = B[j];
            if (ta[1] < tb[0]) {
                i++;
                continue;
            }
            if (tb[1] < ta[0]) {
                j++;
                continue;
            }
            int tmp[] = new int[2];
            tmp[0] = Math.max(ta[0], tb[0]);
            tmp[1] = Math.min(ta[1], tb[1]);
            list.add(tmp);
            if (ta[1] > tb[1]) {
                j++;
                continue;
            }
            if (tb[1] > ta[1]) {
                i++;
                continue;
            }
            if (tb[1] == ta[1]) {
                i++;
                j++;
            }
        }
        int arr[][] = new int[list.size()][2];
        for (int k = 0; k < arr.length; k++) {
            arr[k] = list.get(k);
        }
        return arr;
    }
}
