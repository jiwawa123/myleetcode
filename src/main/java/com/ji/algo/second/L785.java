package com.ji.algo.second;

import java.util.Arrays;

/**
 * user ji
 * data 2020/7/16
 * time 7:52 上午
 */
public class L785 {
    public static void main(String[] args) {

    }

    public boolean isBipartite(int[][] graph) {
        int tmp[] = new int[graph.length];
        Arrays.fill(tmp, -1);
        for (int i = 0; i < graph.length; i++) {
            if (tmp[i] == -1) {
                if (!helpDFS(tmp, 1, i, graph)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean helpDFS(int tmp[], int color, int start, int[][] graph) {
        if (tmp[start] != -1 && tmp[start] != color)
            return false;
        if (tmp[start] == color)
            return true;
        tmp[start] = color;
        for (int i = 0; i < graph[start].length; i++) {
            if (!helpDFS(tmp, color ^ 1, graph[start][i], graph)) {
                return false;
            }
        }

        return true;
    }
}
