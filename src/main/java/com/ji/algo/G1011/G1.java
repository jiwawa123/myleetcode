package com.ji.algo.G1011;

import java.util.HashSet;
import java.util.Set;

/**
 * user ji
 * data 2020/10/11
 * time 11:50 下午
 */
public class G1 {
    public static void main(String[] args) {

    }

    public int maximalNetworkRank(int n, int[][] roads) {
        int res = 0;
        Set<Integer>[] graph = new HashSet[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new HashSet<>();
        }
        for (int i = 0; i < roads.length; i++) {
            int arr[] = roads[i];
            graph[arr[0]].add(arr[1]);
            graph[arr[1]].add(arr[0]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (graph[i].contains(j))
                    res = Math.max(res, graph[i].size() + graph[j].size() - 1);
                else
                res = Math.max(res, graph[i].size() + graph[j].size());
            }
        }

        return res;
    }
}
