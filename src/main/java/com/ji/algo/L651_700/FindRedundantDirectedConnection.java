package com.ji.algo.L651_700;/*
    user ji
    data 2019/8/9
    time 9:59 AM
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindRedundantDirectedConnection {

    public int[] findRedundantDirectedConnection(int[][] edges) {
        int arr[] = new int[edges.length];
        Arrays.fill(arr, -1);
        int first = -1, last = -1;
        for (int i = 0; i < edges.length; i++) {
            int tmp[] = edges[i];
            int start = tmp[0];
            int end = tmp[1];
            if (arr[end] != -1) {
                first = arr[end];
                last = i;
                break;
            }
            arr[end] = i;
        }
        if (first == -1 && last == -1)
            return findRedundantConnectionHelp(edges);
        return edges[first] ;
    }

    public static int[] findRedundantConnectionHelp(int[][] edges) {
        int pre[] = new int[edges.length + 1];
        int arr[] = new int[2];
        Arrays.fill(pre, -1);
        for (int i = 0; i < edges.length; i++) {
            int start = edges[i][0];
            int end = edges[i][1];
            while (pre[start] != -1) {
                start = pre[start];
            }
            while (pre[end] != -1) {
                end = pre[end];
            }
            if (start == end) {
                arr[0] = edges[i][0];
                arr[1] = edges[i][1];
                return arr;
            } else {
                pre[start] = end;
            }
        }
        return arr;
    }
}
