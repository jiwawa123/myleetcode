package com.ji.algo.L901_950;/*
    user ji
    data 2019/8/9
    time 10:42 AM
*/

import java.util.HashMap;
import java.util.Map;

public class MaxSubarraySumCircular {
    public static void main(String[] args) {
        int arr[] = {5, -1, 5};
        System.out.println(maxSubarraySumCircular(arr));
    }

    public static int maxSubarraySumCircular(int[] A) {
        int max = A[0];
        int min = A[0];
        int maxSoFar = A[0];
        int minSoFar = A[0];
        int sum = A[0];
        for (int i = 1; i < A.length; i++) {
            sum += A[i];
            maxSoFar = Math.max(A[i], maxSoFar + A[i]);
            minSoFar = Math.min(A[i], minSoFar + A[i]);
            max = Math.max(max, maxSoFar);
            min = Math.min(min, minSoFar);
        }
        if (max < 0) return max;
        return Math.max(max, sum - min);
    }
}
