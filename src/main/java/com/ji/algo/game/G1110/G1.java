package com.ji.algo.game.G1110;/*
    user ji
    data 2019/11/10
    time 10:28 AM
*/

public class G1 {
    public static void main(String[] args) {
        int tmp[][] = {{1,1},{0,0}};
        System.out.println(oddCells(3,2,tmp));
    }

    public static int oddCells(int m, int n, int[][] indices) {
        int count = 0;
        int arr[][] = new int[m][n];
        for (int i = 0; i < indices.length; i++) {
            int row = indices[i][0];
            int col = indices[i][1];
            for (int j = 0; j < n; j++) {
                arr[row][j] += 1;
            }
            for (int j = 0; j < m; j++) {
                arr[j][col] += 1;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] % 2 == 1)
                    count++;
            }
        }
        return count;
    }
}
