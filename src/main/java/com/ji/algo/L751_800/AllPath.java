package com.ji.algo.L751_800;/*
    user ji
    data 2019/5/11
    time 8:59 PM
*/

import java.util.ArrayList;
import java.util.List;

public class AllPath {
    public static void main(String[] args) {
        int arr[][] = {{1,2},{3},{3},{}};
        allPathsSourceTarget(arr);
    }

    public static  List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> list = new ArrayList<>();
        help(list, graph, 0, new ArrayList<>());
        return list;
    }

    public static void help(List<List<Integer>> list, int[][] graph, int end, List<Integer> tmp) {
        if (end == graph.length - 1) {
            List<Integer> list1 = new ArrayList<>(tmp);
            list1.add(end);
            list.add(list1);
        } else {
            int arr[] = graph[end];
            tmp.add(end);
            for (int i = 0; i < arr.length; i++) {
                List<Integer> tt = new ArrayList<>(tmp);
                help(list, graph, arr[i], tt);
            }
        }
    }
}
