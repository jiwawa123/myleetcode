package com.ji.algo.L2701_2750;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Bei Chang
 * @Date: 2023/05/28/19:44
 */
public class L2711 {
    public static void main(String[] args) {

    }

    public int[][] differenceOfDistinctValues(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] res = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int row_r = i - 1;
                int row_c = j - 1;
                Set<Integer> l = new HashSet<>();
                Set<Integer> r = new HashSet<>();
                while (row_r >= 0 && row_c >= 0) {
                    l.add(grid[row_r--][row_c--]);
                }
                row_r = i + 1;
                row_c = j + 1;
                while (row_r < row && row_c < col) {
                    r.add(grid[row_r++][row_c++]);
                }
                res[i][j] = Math.abs(l.size() - r.size());
            }
        }
        return res;
    }
}
