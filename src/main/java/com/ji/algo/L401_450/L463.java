package com.ji.algo.L401_450;

/**
 * user ji
 * data 2020/10/30
 * time 10:18 上午
 */
public class L463 {
    public static void main(String[] args) {

    }

    public int islandPerimeter(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int res = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 0)
                    continue;
                res += 4;
                if (j > 0 && grid[i][j - 1] == 1) {
                    res--;
                }
                if (i > 0 && grid[i - 1][j] == 1) {
                    res--;
                }
                if (j < col - 1 && grid[i][j + 1] == 1) {
                    res--;
                }
                if (i < row - 1 && grid[i + 1][j] == 1) {
                    res--;
                }
            }
        }
        return res;
    }
}
