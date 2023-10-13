package com.ji.ready202309;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/07/22:44
 */
public class L200 {
    public static void main(String[] args) {

    }

    int[][] arr;
    int res;
    int row, col;

    public int numIslands(char[][] grid) {
        row = grid.length;
        col = grid[0].length;
        arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1' && arr[i][j] == 0) {
                    res++;
                    dfs(grid, i, j, res);

                }
            }
        }
        return res;
    }

    public void dfs(char[][] grid, int r, int l, int color) {
        if (r < 0 || l < 0 || r >= row || r >= col || grid[r][l] == '0') {
            return;
        }
        arr[r][l] = color;
        dfs(grid, r + 1, l, color);
        dfs(grid, r - 1, l, color);
        dfs(grid, r, l + 1, color);
        dfs(grid, r, l - 1, color);
    }

}
