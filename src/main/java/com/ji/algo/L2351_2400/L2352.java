package com.ji.algo.L2351_2400;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Bei Chang
 * @Date: 2022/07/30/上午8:14
 */
public class L2352 {
    public static void main(String[] args) {
        int[][] grid = {{3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}};
        System.out.println(equalPairs(grid));
    }

    public static int equalPairs(int[][] grid) {
        Map<String, Integer> map = new HashMap<>();
        int n = grid.length;
        for (int i = 0; i < n; i++) {
            StringBuilder sp = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sp.append(grid[i][j]+",");
            }
            map.put(sp.toString(), map.getOrDefault(sp.toString(), 0) + 1);
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            StringBuilder sp = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sp.append(grid[j][i]+",");
            }
            res += map.getOrDefault(sp.toString(), 0);
        }
        return res;


    }
}
