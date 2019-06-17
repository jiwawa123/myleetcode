package com.ji.algo.L651_700;/*
    user ji
    data 2019/6/17
    time 9:10 AM
*/

import java.util.Arrays;

public class FindRedundantConnection {
    public static void main(String[] args) {
        int arr[][] = {{3, 4}, {1, 2}, {2, 4}, {3, 5}, {2, 5}};
        System.out.println(Arrays.toString(findRedundantConnection(arr)));
    }

    public static int[] findRedundantConnection(int[][] edges) {
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
