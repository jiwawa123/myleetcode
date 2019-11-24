package com.ji.algo.game.G1117;/*
    user ji
    data 2019/11/17
    time 10:30 AM
*/

import java.util.ArrayList;
import java.util.List;

public class G1 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        if (k == 0) {
            List<List<Integer>> list = new ArrayList<>();
            for (int i = 0; i < grid.length; i++) {
                List<Integer> li = new ArrayList<>();
                for (int j = 0; j < grid[i].length; j++) {
                    li.add(grid[i][j]);
                }
                list.add(li);
            }
            return list;
        }
        int m = grid.length;
        int n = grid[0].length;
        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                arr[i][j] = grid[i][j - 1];
            }
        }
        for (int i = 1; i < m; i++) {
            arr[i][n - 1] = grid[i - 1][0];
        }
        arr[0][0] = grid[m - 1][n - 1];
        if (k == 1) {
            List<List<Integer>> list = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                List<Integer> li = new ArrayList<>();
                for (int j = 0; j < arr[i].length; j++) {
                    li.add(arr[i][j]);
                }
                list.add(li);
            }
            return list;
        }
        return shiftGrid(arr, k - 1);
    }
}
