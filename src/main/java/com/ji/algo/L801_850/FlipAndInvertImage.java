package com.ji.algo.L801_850;/*
    user ji
    data 2019/5/14
    time 5:35 PM
*/

public class FlipAndInvertImage {
    public static void main(String[] args) {
        System.out.println(0 ^ 1);
    }

    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int start = 0, end = A[i].length - 1;
            while (start <= end) {
                int tmp = A[i][start];
                A[i][start] = A[i][end] ^ 1;
                A[i][end] = tmp ^ 1;
            }
        }
        return A;
    }
}
