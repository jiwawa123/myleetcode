package com.ji.algo.L51_100;/*
    user ji
    data 2019/4/9
    time 4:37 PM
*/

public class MinPathSum {
    public static void main(String[] args) {

    }

    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int re[][] = new int[row][col];
        re[0][0] = grid[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 && j == 0)
                    continue;
                if (i == 0) {
                    re[i][j] = grid[i][j] + re[i][j - 1];
                    continue;
                }
                if(j==0){
                    re[i][j] = grid[i][j] + re[i-1][j];
                    continue;
                }
                re[i][j] = Math.min(re[i-1][j],re[i][j - 1])+grid[i][j];
            }
        }
        return re[row - 1][col - 1];
    }
}
