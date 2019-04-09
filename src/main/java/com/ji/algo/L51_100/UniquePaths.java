package com.ji.algo.L51_100;/*
    user ji
    data 2019/4/9
    time 2:48 PM
*/

public class UniquePaths {
    public static void main(String[] args) {

    }

    public int uniquePaths(int m, int n) {
        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            arr[m][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            arr[0][n] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
            }
        }
        return arr[m - 1][n - 1];
    }
}
