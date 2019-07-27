package com.ji.algo.L1001_1050;/*
    user ji
    data 2019/7/27
    time 2:54 PM
*/

public class MaxSumTwoNoOverlap {
    public static void main(String[] args) {
        int arr[] = {0, 6, 5, 2, 2, 5, 1, 9, 4};
        System.out.println(maxSumTwoNoOverlap(arr, 1, 2));
    }

    public static int maxSumTwoNoOverlap(int[] A, int L, int M) {
        return Math.max(maxSumTwoNoOverlapII(A,L,M),maxSumTwoNoOverlapII(A,M,L));
    }
    public static int maxSumTwoNoOverlapII(int[] A, int L, int M) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            int index = i;
            if (index < L - 1 || A.length - index < M)
                continue;
            int left = 0;
            int rifht = 0;
            int len = 0;
            int len1 = 0;
            int cou = 0;
            int cou1 = 0;
            for (int j = 0; j <= index; j++) {
                if (len < L) {
                    len++;
                    cou += A[j];
                } else {
                    left = Math.max(left, cou);
                    cou -= A[j - L];
                    cou += A[j];
                }
            }
            left = Math.max(left, cou);
            for (int j = index + 1; j < A.length; j++) {
                if (len1 < M) {
                    len1++;
                    cou1 += A[j];
                } else {
                    rifht = Math.max(rifht, cou1);
                    cou1 -= A[j - M];
                    cou1 += A[j];
                }
            }
            rifht = Math.max(rifht, cou1);
            count = Math.max(count, left + rifht);
        }
        return count;
    }
}
