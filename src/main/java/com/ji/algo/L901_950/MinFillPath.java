package com.ji.algo.L901_950;/*
    user ji
    data 2019/6/4
    time 2:35 PM
*/

public class MinFillPath {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        minFallingPathSum(arr);
    }
    public static int minFallingPathSum(int[][] A) {
        int max = Integer.MAX_VALUE;
        int arr[][] = new int[A.length][A[0].length];
        for (int i = 0; i < A[0].length; i++) {
            arr[0][i] = A[0][i];
            max = Math.min(max, arr[0][i]);
        }

        for (int i = 1; i < A.length; i++) {
            max = Integer.MAX_VALUE;
            for (int j = 0; j < A[i].length; j++) {
                int tmp = arr[i - 1][j];
                if (j > 0) {
                    tmp = Math.min(tmp, arr[i - 1][j - 1]);
                }
                if (j < A[i].length - 1) {
                    tmp = Math.min(tmp, arr[i - 1][j + 1]);
                }
                arr[i][j] = tmp + A[i][j];
                max = Math.min(max, arr[i][j]);
            }
        }
        return max;
    }
}
