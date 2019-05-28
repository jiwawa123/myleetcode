package com.ji.algo.L901_950;/*
    user ji
    data 2019/5/28
    time 11:30 AM
*/

import java.util.Arrays;

public class SmallRangeI {
    public static void main(String[] args) {

    }

    public int smallestRangeI(int[] A, int K) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            min = Math.min(A[i], min);
            max = Math.max(A[i], max);
        }
        if (max - min < 2 * Math.abs(K))
            return 0;
        return max - min - 2 * Math.abs(K);
    }
}
