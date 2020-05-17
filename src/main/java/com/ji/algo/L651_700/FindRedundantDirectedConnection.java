package com.ji.algo.L651_700;/*
    user ji
    data 2019/8/9
    time 9:59 AM
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindRedundantDirectedConnection {

    int arr[];
    List<int[]> list;

    public int[] findRedundantDirectedConnection(int[][] edges) {
        arr = new int[edges.length + 1];
        Arrays.fill(arr, -1);
        list = new ArrayList<>();
        for (int i = 0; i < edges.length; i++) {
            int[] tmp = edges[i];
            int s = getIndex(tmp[0]);
            int f = getIndex(tmp[1]);
            if (s == f) {
                list.add(tmp);
                continue;
            }
            arr[f] = s;
        }
        return list.get(list.size() - 1);
    }

    public int getIndex(int t) {
        while (arr[t] != -1) {
            t = arr[t];
        }
        return t;
    }
}
