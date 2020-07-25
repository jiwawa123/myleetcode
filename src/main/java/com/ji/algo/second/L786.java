package com.ji.algo.second;

import java.util.*;

/**
 * user ji
 * data 2020/7/25
 * time 9:16 上午
 */
public class L786 {
    public static void main(String[] args) {

    }

    public int[] kthSmallestPrimeFraction(int[] A, int K) {
        // 因为分数是在(0,1)范围内，所以在此范围使用二分查找
        double lo = 0, hi = 1, mid;
        int p = 0, q = 1;
        int i, j;
        int count;
        // 因为是在小数内使用二分查找，无法像在整数范围内那样通过 mid+1和边界判断来终止循环
        // 所以此处根据count来结束循环
        while (true) {
            mid = (lo + hi) / 2;
            count = 0;
            p = 0;
            for (i = 0; i < A.length; i++) {
                j = 0;
                while (j < A.length - 1 - i && mid >= (double) A[i] / A[A.length - 1 - j]) {
                    j++;
                }
                count += j;
                // 重点：p/q是比 mid小的数中的最大值(所有行)
                if (j > 0 && ((double) p / q) < ((double) A[i] / A[A.length - j])) {
                    p = A[i];
                    q = A[A.length - j];
                }
            }
            if (count > K) hi = mid;
            else if (count < K) lo = mid;
            else return new int[]{p, q};
        }
    }
}