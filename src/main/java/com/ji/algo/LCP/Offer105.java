package com.ji.algo.LCP;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Bei Chang
 * @Date: 2023/06/28/23:00
 */
public class Offer105 {
    public static void main(String[] args) {

    }

    int[][] arr;
    int row = 0;
    int col = 0;

    public int maxAreaOfIsland(int[][] grid) {
        row = grid.length;
        col = grid[0].length;
        arr = new int[row][col];
        int index = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] != 0 && arr[i][j] == 0) {
                    dfs(i, j, grid, index++);
                }
            }
        }
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] != 0) {
                    map.put(arr[i][j], map.getOrDefault(arr[i][j], 0) + 1);
                    res = Math.max(res, map.get(arr[i][j]));
                }
            }
        }
        return res;
    }

    public void dfs(int i, int j, int[][] grid, int index) {
        if (i < 0 || i >= row || j < 0 || j >= col) {
            return;
        }
        if (arr[i][j] != 0 || grid[i][j] == 0) {
            return;
        }
        dfs(i - 1, j, grid, index);
        dfs(i + 1, j, grid, index);
        dfs(i, j - 1, grid, index);
        dfs(i, j + 1, grid, index);
    }
}
