package com.ji.algo.L801_850;/*
    user ji
    data 2019/6/2
    time 5:47 PM
*/

public class SurfaceArea {
    public static void main(String[] args) {

    }

    //计算底面积侧面积与正面积即可
    public int surfaceArea(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] > 0) {
                    count += 2;
                    count += 2 * grid[i][j];
                }
                if (j > 0 && grid[i][j - 1] > 0) {
                    count -= 2 * Math.min(grid[i][j], grid[i][j - 1]);
                }
            }
        }
        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if(grid[j][i]>0)
                    count+=2*grid[j][i];
                if(j>0&&grid[j-1][i]>0)
                    count -= 2 * Math.min(grid[j][i-1], grid[j][i]);
            }
        }
        return count;
    }
}
