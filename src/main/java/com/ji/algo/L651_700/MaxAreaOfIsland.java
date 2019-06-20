package com.ji.algo.L651_700;/*
    user ji
    data 2019/6/20
    time 8:34 AM
*/

import java.util.HashMap;
import java.util.Map;

public class MaxAreaOfIsland {
    public static void main(String[] args) {

    }

    public int maxAreaOfIsland(int[][] grid) {
        if (grid == null || grid.length == 0)
            return 0;
        int re[][] = new int[grid.length][grid[0].length];
        int type = 1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != 0 && re[i][j] == 0)
                    help(grid, i, j, re, type++);
            }
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < re.length; i++) {
            for (int j = 0; j < re[0].length; j++) {
                if (re[i][j] != 0)
                    map.put(re[i][j], map.getOrDefault(re[i][j], 0) + 1);
            }
        }
        int max = 0;
        for (int k : map.values()
                ) {
            max = Math.max(k, max);
        }
        return max;
    }

    public void help(int[][] grid, int row, int col, int re[][], int type) {
        if (row < 0 || row > grid.length - 1 ||
                col < 0 || col > grid[0].length-1 || grid[row][col] == 0 || re[row][col] != 0)
            return;
        re[row][col] = type;
        help(grid, row - 1, col, re, type);
        help(grid, row + 1, col, re, type);
        help(grid, row, col - 1, re, type);
        help(grid, row, col + 1, re, type);
    }

}
