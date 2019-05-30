package com.ji.algo.L201_250;/*
    user ji
    data 2019/4/18
    time 9:34 PM
*/

import java.util.ArrayList;
import java.util.List;


public class CanFinish {
    public static void main(String[] args) {
        int arr[][] = {{1, 0}, {0, 2}, {2, 1}};
        System.out.println(new CanFinish().canFinish(3, arr));
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //可以构建邻接矩阵
        List<List<Integer>> adj = new ArrayList<>();
        //完成矩阵的初始化
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        //开始构建
        for (int i = 0; i < prerequisites.length; i++) {
            List<Integer> tmp = adj.get(prerequisites[i][0]);
            tmp.add(prerequisites[i][1]);
            adj.set(prerequisites[i][0], tmp);
        }
        return help(adj);
    }

    public boolean help(List<List<Integer>> adj) {
        if (adj == null || adj.size() < 2)
            return true;
        for (int i = 0; i < adj.size(); i++) {
            List<Integer> tmp = adj.get(i);
            if (tmp.size() == 0)
                continue;
            boolean flag[] = new boolean[adj.size()];
            flag[i] = true;
            for (int j = 0; j < tmp.size(); j++) {
                if (!dfs(adj, i, tmp.get(j), flag)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean dfs(List<List<Integer>> adj, int start, int end, boolean flag[]) {
        if (flag[end] || adj.get(end).size() == 0)
            return true;
        flag[end] = true;
        List<Integer> tmp = adj.get(end);
        for (int i = 0; i < tmp.size(); i++) {
            if (tmp.get(i) == start||!dfs(adj, start, tmp.get(i), flag))
                return false;
        }
        return true;
    }

}
