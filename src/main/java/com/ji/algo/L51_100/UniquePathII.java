package com.ji.algo.L51_100;/*
    user ji
    data 2019/4/9
    time 4:26 PM
*/

public class UniquePathII {
    public static void main(String[] args) {
        int arr[][] = {{0,0,0},{0,1,0},{0,0,0}};
        uniquePathsWithObstacles(arr);
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (null == obstacleGrid || obstacleGrid[0].length == 0)
            return 0;
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            if (i > 0) {
                if (obstacleGrid[i][0] == 1 || arr[i - 1][0] == 0) {
                    arr[i][0] = 0;
                    continue;
                }
                arr[i][0] = 1;
            } else {
                arr[i][0] = obstacleGrid[i][0] == 0 ? 1 : 0;
            }
        }
        for (int i = 1; i < col; i++) {
            if (obstacleGrid[i][0] == 1 || arr[i - 1][0] == 0) {
                arr[i][0] = 0;
                continue;
            }
            arr[i][0] = 1;
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (obstacleGrid[i][j] == 1)
                    continue;
                arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
            }
        }
        return arr[row - 1][col - 1];
    }
}
