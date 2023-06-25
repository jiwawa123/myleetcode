package com.ji.algo.LCP;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Bei Chang
 * @Date: 2023/06/18/21:21
 */
public class LO110 {
    public static void main(String[] args) {

    }

    List<List<Integer>> list;
    int len;

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        len = graph.length - 1;
        for (int i = 0; i < graph[0].length; i++) {
            dfs(graph, new LinkedList<>(), graph[0][i]);
        }

        return list;
    }

    public void dfs(int[][] graph, List<Integer> list1, int next) {
        List<Integer> list2 = new LinkedList<>(list1);
        if (next == len) {
            list1.add(len);
            list.add(list1);
            return;
        }
        list2.add(next);
        for (int i = 0; i < graph[next].length; i++) {
            dfs(graph, list2, graph[next][i]);
        }
    }
}
