package com.ji.algo.L951_1000;/*
    user ji
    data 2019/6/2
    time 12:35 PM
*/


import java.util.Arrays;

public class LargestPerimeter {
    public static void main(String[] args) {

    }

    public int largestPerimeter(int[] A) {
        int count = 0;
        Arrays.sort(A);
        for (int i = A.length - 1; i >= 2; i--) {
            if(A[i]*3<count)
                break;
            int j = i - 1;
            int k = i - 2;
            if (A[i] < A[j] + A[k] && A[k] < A[i] + A[j] && A[j] < A[i] + A[k]) {
                count = Math.max(count, A[i] + A[k] + A[j]);
            }
        }
        return count;
    }
}
