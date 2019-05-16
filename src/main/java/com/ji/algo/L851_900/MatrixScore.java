package com.ji.algo.L851_900;/*
    user ji
    data 2019/5/16
    time 7:11 PM
*/

import java.lang.reflect.Array;
import java.util.Arrays;

public class MatrixScore {
    public static void main(String[] args) {
        int arr[][] = {{0, 0, 1, 1}, {1, 0, 1, 0}, {1, 1, 0, 0}};
        matrixScore(arr);
    }

    public static int matrixScore(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i][0] == 0) {
                for (int j = 0; j < A[i].length; j++) {
                    A[i][j] ^= 1;
                }
            }
        }
        for (int i = 0; i < A[0].length; i++) {
            int tmp = A.length;
            int count = 0;
            for (int j = 0; j < A.length; j++) {
                if (A[j][i] == 0)
                    count++;
            }
            if (count > tmp / 2) {
                for (int j = 0; j < A.length; j++) {
                    A[j][i] ^= 1;
                }
            }
        }
        int res = 0;
        for (int i = A[0].length - 1; i >= 0; i--) {
            for (int j = 0; j < A.length; j++) {
                if (A[j][i] == 1) {
                    res += Math.pow(2, A[0].length - i - 1);
                }
            }
        }
        return res;
    }
}
