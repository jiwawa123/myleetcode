package com.ji.algo.G1124;/*
    user ji
    data 2019/11/24
    time 10:29 AM
*/

public class G2 {
    public static void main(String[] args) {
        int arr[][] = {{1, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}};
        System.out.println(countServers(arr));
    }

    public static int countServers(int[][] grid) {
        int count = 0;
        if (grid == null || grid.length == 0)
            return count;
        int row[] = new int[grid.length];
        int col[] = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    row[i] += 1;
                    col[j] += 1;
                }
            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    if (row[i] > 1 || col[j] > 1)
                        count += 1;
                }
            }
        }
        return count;
    }
}
