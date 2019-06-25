package com.ji.algo.L751_800;/*
    user ji
    data 2019/6/25
    time 9:50 PM
*/

import java.util.Arrays;

public class IsBipartite {
    public static void main(String[] args) {
        int[][] graph = {{1, 3}, {0, 2}, {1, 3}, {0, 2}};
        new IsBipartite().isBipartite(graph);
    }

    public boolean isBipartite(int[][] graph) {
        int tmp[] = new int[graph.length];
        Arrays.fill(tmp, -1);
        for (int i = 0; i < graph.length; i++) {
            if (tmp[i] == -1)
                if (!help_dfs(tmp, 1, i, graph))
                    return false;
        }
        return true;
    }

    public boolean help_dfs(int tmp[], int color, int start, int[][] graph) {
        if (tmp[start] != -1 && tmp[start] != color)
            return false;
        if (tmp[start] == color)
            return true;
        tmp[start] = color;
        for (int i = 0; i < graph[start].length; i++) {
            if (!help_dfs(tmp, color ^ 1, graph[start][i], graph))
                return false;
        }
        return true;
    }
}
