package com.ji.algo.L1001_1050;/*
    user ji
    data 2019/5/25
    time 4:27 PM
*/

import java.util.Arrays;

public class KNegation {
    public static void main(String[] args) {
        int arr[] = {4,3,2};
        System.out.println(largestSumAfterKNegations(arr,1));
    }

    public static int largestSumAfterKNegations(int[] A, int K) {
        Arrays.sort(A);
        int i = 0;
        while (K > 0 && i < A.length) {
            if (A[i] > 0) {
                break;
            } else {
                A[i] = -A[i];
            }
            K--;
            i++;
        }
        Arrays.sort(A);
        int count = 0;
        if (K > 0) {
            for (int j = 1; j < A.length; j++) {
                count += A[j];
            }
            if (K % 2 != 0) {
                return count - A[0];
            } else {
                return count + A[0];
            }
        } else {
            for (int j = 0; j < A.length; j++) {
                count += A[j];
            }
        }
        return count;
    }
}
