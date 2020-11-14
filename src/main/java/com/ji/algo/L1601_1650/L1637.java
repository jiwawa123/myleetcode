package com.ji.algo.L1601_1650;

import java.util.Arrays;

/**
 * user ji
 * data 2020/11/14
 * time 9:17 下午
 */
public class L1637 {
    public static void main(String[] args) {

    }

    public int maxWidthOfVerticalArea(int[][] points) {
        int arr[] = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            arr[i] = points[i][0];
        }
        Arrays.sort(arr);
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i] - arr[i - 1]);
        }
        return max;
    }
}
