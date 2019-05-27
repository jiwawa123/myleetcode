package com.ji.algo.L451_500;/*
    user ji
    data 2019/5/27
    time 10:10 AM
*/

public class IslandPerimeter {
    public static void main(String[] args) {

    }

    public int islandPerimeter(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] == 1) {
                    count += 4;
                    if (i > 0) {
                        if (grid[i - 1][j] == 1)
                            count -= 1;
                    }
                    if (i < grid.length - 1) {
                        if (grid[i + 1][j] == 1)
                            count -= 1;
                    }
                    if (j > 0) {
                        if (grid[i][j - 1] == 1)
                            count -= 1;
                    }
                    if (j < grid[i].length - 1) {
                        if (grid[i][j + 1] == 1)
                            count -= 1;
                    }
                }
            }
        }
        return count;
    }
}
