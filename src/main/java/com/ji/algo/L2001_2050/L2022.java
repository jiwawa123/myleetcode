package com.ji.algo.L2001_2050;

/**
 * @author ji
 * @data 2021/10/10
 * @time 10:11 下午
 */
public class L2022 {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 1};
        System.out.println(construct2DArray(arr, 4, 1));
    }

    public static int[][] construct2DArray(int[] original, int m, int n) {
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = original[n * i + j];
            }
        }
        return arr;
    }
}
