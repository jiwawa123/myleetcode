package com.ji.algo.L651_700;/*
    user ji
    data 2019/6/4
    time 9:59 PM
*/

public class ImageSmoother {
    public static void main(String[] args) {

    }

    public int[][] imageSmoother(int[][] M) {
        int arr[][] = new int[M.length][M[0].length];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                int tmp = M[i][j];
                int count = 1;
                if (i - 1 >= 0) {
                    tmp += M[i - 1][j];
                    count++;
                }
                if (i + 1 < M.length) {
                    tmp += M[i + 1][j];
                    count++;
                }
                if (j > 0) {
                    tmp += M[i][j - 1];
                    count++;
                }
                if (j + 1 < M[0].length) {
                    tmp += M[i][j + 1];
                    count++;
                }
                if (i - 1 >= 0 && j > 0) {
                    tmp += M[i - 1][j - 1];
                    count++;
                }
                if (i - 1 >= 0 && j < M[0].length - 1) {
                    tmp += M[i - 1][j + 1];
                    count++;
                }
                if (i + 1 < M.length && j > 0) {
                    tmp += M[i + 1][j - 1];
                    count++;
                }
                if (i + 1 < M.length && j < M[0].length - 1) {
                    tmp += M[i + 1][j + 1];
                    count++;
                }
                arr[i][j] = tmp / count;
            }
        }
        return arr;
    }
}
