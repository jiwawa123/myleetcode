package com.ji.algo.L851_900;/*
    user ji
    data 2019/8/21
    time 8:26 PM
*/

public class LargestOverlap {
    public static void main(String[] args) {

    }

    public int largestOverlap(int[][] A, int[][] B) {
        int res = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                res = Math.max(res, match(A, B, i, j));
                res = Math.max(res, match(B, A, i, j));
            }
        }
        return res;
    }

    public int match(int[][] a, int[][] b, int r, int c) {
        int x = 0;
        for (int i1 = r, i2 = 0; i1 < a.length && i2 < b.length; i1++, i2++) {
            for (int j1 = c, j2 = 0; j1 < a.length && i2 < b.length; j1++, j2++) {
                x += (a[i1][j1] & b[i2][j2]);
            }
        }
        return x;
    }
}
