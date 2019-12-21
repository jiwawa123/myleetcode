package com.ji.algo.G1215;/*
    user ji
    data 2019/12/15
    time 10:45 AM
*/

import java.util.Arrays;

public class G4 {
    public static void main(String[] args) {
        G4 g4 = new G4();
        int arr[][] = {{0, 0, 0},
                {1, 1, 0},
                {0, 0, 0},
                {0, 1, 1},
                {0, 0, 0}};
        System.out.println(g4.shortestPath(arr, 1));
    }

    int row;
    int col;
    int step[][];
    int lastK[][];

    public int shortestPath(int[][] grid, int k) {
        row = grid.length;
        col = grid[0].length;
        step = new int[row][col];
        lastK = new int[row][col];
        for (int i = 0; i < row; i++) {
            Arrays.fill(step[i], -1);
            Arrays.fill(lastK[i], k);
        }
        help(0, 0, grid, k, 0);
        return step[row - 1][col - 1];
    }

    public void help(int x, int y, int[][] grid, int k, int st) {
        if(x==3&&y==2){
            System.out.println( );
        }
        //边界判断
        if (x < 0 || x >= row || y < 0 || y >= col)
            return;
        //如果已经走过，而且当前步数已经超过现存步数，则结束
        if (step[x][y] != -1 && step[x][y] <= st && lastK[x][y] >= k)
            return;
        //如果这个点没有障碍，直接计算即可
        if (grid[x][y] == 0) {
            step[x][y] = st;
            lastK[x][y] = k;
            help(x - 1, y, grid, k, st + 1);
            help(x + 1, y, grid, k, st + 1);
            help(x, y - 1, grid, k, st + 1);
            help(x, y + 1, grid, k, st + 1);
        } else { //这个点是障碍点
            if (k == 0)
                return;
            k--;
            if (step[x][y] == -1) {
                step[x][y] = st;
                lastK[x][y] = k;
            } else {
                step[x][y] = Math.min(step[x][y], st);
            }
            help(x - 1, y, grid, k, st + 1);
            help(x + 1, y, grid, k, st + 1);
            help(x, y - 1, grid, k, st + 1);
            help(x, y + 1, grid, k, st + 1);
        }

    }
}
