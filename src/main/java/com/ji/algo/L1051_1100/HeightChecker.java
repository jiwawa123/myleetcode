package com.ji.algo.L1051_1100;/*
    user ji
    data 2019/5/28
    time 7:40 AM
*/

import java.lang.reflect.Array;
import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 2, 1, 1, 1, 2, 1};
        System.out.println(heightChecker(arr));
    }

    public static int heightChecker(int[] heights) {
        int arr[] = new int[heights.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = heights[i];
        }
        Arrays.sort(heights);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (arr[i] != heights[i])
                count++;
        }
        return count;
    }
}
