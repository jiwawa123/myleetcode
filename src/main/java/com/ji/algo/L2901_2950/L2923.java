package com.ji.algo.L2901_2950;

/**
 * @Author: Bei Chang
 * @Date: 2023/12/08/16:53
 */
public class L2923 {
    public static void main(String[] args) {

    }

    public int findChampion(int[][] grid) {
        int n = grid.length;
        int res = -1;
        for (int i = 0; i < n; i++) {
            int t = 0;
            for (int j = 0; j < n; j++) {
                if (grid[j][i] == 0) {
                    t++;
                }
            }
            if (t == n) {
                return res;
            }
        }
        return res;
    }
}
