package com.ji.algo.L951_1000;/*
    user ji
    data 2019/5/2
    time 4:08 PM
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class KClose {
    public static void main(String[] args) {

    }
    public int[][] kClosest(int[][] points, int K) {
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < points.length; i++) {
            list.add(points[i]);
        }
        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (int)(((long)(o1[0]*o1[0]) + (long)(o1[1]*o1[1])) -
                        ((long)(o2[0]*o2[0]) + (long)(o2[1]*o2[1]))) ;
            }
        });
        int[][] res = new int[K][2];
        for (int i = 0; i < K; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
