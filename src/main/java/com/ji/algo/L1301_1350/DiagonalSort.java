package com.ji.algo.L1301_1350;/*
    user ji
    data 2020/1/30
    time 9:51 AM
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiagonalSort {
    public static void main(String[] args) {

    }

    public static int[][] diagonalSort(int[][] mat) {
        if (mat == null || mat.length == 0)
            return mat;
        int m = mat.length;
        int n = mat[0].length;
        for (int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList<>();
            int p = i;
            int q = 0;
            while (p < n && q < m) {
                list.add(mat[q++][p++]);
            }
            Collections.sort(list);
            p = i;
            q = 0;
            int index = 0;
            while (index < list.size()) {
                mat[q++][p++] = list.get(index++);
            }
        }

        for (int i = 1; i < m; i++) {
            int p = i;
            int q = 0;
            List<Integer> list = new ArrayList<>();
            while (p < m && q < n) {
                list.add(mat[p++][q++]);
            }
            Collections.sort(list);
            p = i;
            q = 0;
            int index = 0;
            while (index < list.size()) {
                mat[p++][q++] = list.get(index++);
            }
        }
        return mat;
    }
}
