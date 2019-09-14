package com.ji.algo.L251_300;/*
    user ji
    data 2019/9/14
    time 11:32 AM
*/

import java.util.ArrayList;
import java.util.List;

public class WallsAndGates {
    public static void main(String[] args) {

    }

    // 开始考虑从0出发
    public int[][] getDistance(int arr[][]) {
        int row = arr.length;
        int col = arr[0].length;
        int res[][] = new int[row][col];
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                res[i][j] = arr[i][j];
                if (arr[i][j] == 0) {
                    int inter[] = {i, j};
                    list.add(inter);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            help(list.get(i)[0], list.get(i)[1], arr, res, 0);
        }
        return res;
    }

    public void help(int row, int col, int arr[][], int res[][], int len) {
        if (row < 0 || row >= arr.length || col < 0 || col >= arr[0].length || arr[row][col] == -1)
            return;
        if (len >= 1 && len >= res[row][col])
            return;
        res[row][col] = len;
        help(row + 1, col, arr, res, len + 1);
        help(row - 1, col, arr, res, len + 1);
        help(row, col + 1, arr, res, len + 1);
        help(row, col - 1, arr, res, len + 1);
    }

}
