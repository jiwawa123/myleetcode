package com.ji.algo.L1001_1050;/*
    user ji
    data 2019/4/30
    time 8:14 PM
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AllCellsDistOrder {
    public static void main(String[] args) {
        allCellsDistOrder(1,2,0,0);
    }
    public static int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < R; i++) {

            for (int j = 0; j < C; j++) {
                int arr[] = new int[2];
                arr[0] = i;
                arr[1] = j;
                int[] tmp = arr;
                list.add(tmp);
            }
        }
        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                int a = Math.abs(r0-o1[0])+Math.abs(c0-o1[1]);
                int b = Math.abs(r0-o2[0])+Math.abs(c0-o2[1]);
                return a - b;
            }
        });
        int[][] res = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

}
