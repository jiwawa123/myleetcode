package com.ji.algo.L951_1000;/*
    user ji
    data 2019/8/21
    time 2:50 PM
*/

import java.util.Arrays;

public class PrisonAfterNDays {
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 1, 1, 0, 0, 1};
        prisonAfterNDays(arr, 3000);
    }


    public static int[] prisonAfterNDays(int[] cells, int N) {
        if(N == 0) {
            return cells;
        }
        // 14 为一个循环
        int[][] nCells = new int[14][cells.length];
        nCells[0][0] = 0;
        nCells[0][cells.length - 1] = 0;
        for (int j = 1; j < cells.length - 1; j++) {
            nCells[0][j] = (cells[j - 1] ^ cells[j + 1]) ^ 1;
        }
        for (int i = 1; i < 14; i++) {
            for (int j = 1; j < cells.length - 1; j++) {
                nCells[i][j] = (nCells[i - 1][j - 1] ^ nCells[i - 1][j + 1]) ^ 1;
            }
        }
        return nCells[(N -1) % 14];
    }
}
