package com.ji.algo.game.G0217;/*
    user ji
    data 2020/2/17
    time 4:46 PM
*/

public class L {
    public static void main(String[] args) {

    }

    public int countNegatives(int[][] grid) {
        if (null == grid || grid.length == 0)
            return 0;
        int count = 0;
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] < 0) {
                    count += n - j;
                    break;
                }
            }
        }

        return count;
    }
}
