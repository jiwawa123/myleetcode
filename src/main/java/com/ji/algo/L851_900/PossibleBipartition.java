package com.ji.algo.L851_900;/*
    user ji
    data 2019/8/22
    time 3:39 PM
*/

import java.util.*;

public class PossibleBipartition {
    public static void main(String[] args) {
        int arr[][] =
                {{4,7},{4,8},{5,6},{1,6},{3,7},{2,5},{5,8},{1,2},{4,9},{6,10},{8,10},{3,6},{2,10},{9,10},{3,9},{2,3},{1,9},{4,6},{5,7},{3,8},{1,8},{1,7},{2,4}};

    }

    private Map<Integer , List<Integer>> graph = new HashMap<>();   // 图存放的数据结构
    private int[] color;                                            // 每个节点的颜色

    public boolean possibleBipartition(int N, int[][] dislikes) {

        color = new int[N + 1];
        Arrays.fill(color , - 1);
        for (int i = 1;i <= N;i ++) {
            graph.put(i , new ArrayList<>());
        }
        for (int[] edge : dislikes) {                    // 将图存入Map
            int from = edge[0] , to = edge[1];
            graph.get(from).add(to);
            graph.get(to).add(from);
        }
        for (int i = 1;i <= N;i ++) {                   // 未判断的节点进行判断
            if (color[i] < 0) {
                color[i] = 0;
                if (!dfs(i)) {
                    return false;
                }
            }
        }
        return true;

    }

    private boolean dfs(int current) {

        for (int next : graph.get(current)) {
            if (color[next] < 0) {
                color[next] = 1 - color[current];       //第一圈为1 第二圈为0 第三圈为1 依次类推(主要是为了判断相邻的两个层会不会染色冲突)
                if (!dfs(next)) {                       // 判断 下一节点染色是否成功 ，失败则返回false
                    return false;
                }
            } else if (color[next] == color[current]) {
                return false;                           //发现Vi 与 Vi-1 节点颜色相同
            }
        }
        return true;

    }

}
