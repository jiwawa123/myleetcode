package com.ji.algo.G0712;

import java.util.LinkedList;

/**
 * user ji
 * data 2020/7/12
 * time 10:29 上午
 */
public class G3 {
    public static void main(String[] args) {
        double a1[] = {0.37, 0.17, 0.93, 0.23, 0.39, 0.04};
        int arr[][] = {{1, 4}, {2, 4}, {0, 4}, {0, 3}, {0, 2}, {2, 3}};
        System.out.println(maxProbability(5, arr, a1, 3, 4));
    }


    public static double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        double dp[][] = new double[n][n];
        double[] dis = new double[n];
        int max = 0;
        // 记录哪些点已知最短路径
        int[] book = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    dp[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < edges.length; i++) {
            int s = edges[i][0];
            int e = edges[i][1];
            dp[s][e] = succProb[i];
            dp[e][s] = succProb[i];
        }

        // 初始化dis 初始化book
        for (int i = 0; i < n; i++) {
            dis[i] = dp[start][i];
            book[i] = 0;
        }
        book[start] = 1;

        int tempj = 0;
        // 核心算法部分
        for (int i = 0; i < n; i++) {
            double min = 0;
            // 找到离1号顶点最近的顶点，
            // 每次循环结束都能确定一个离1号点最近的点
            for (int j = 0; j < n; j++) {
                //当前点还未确定最小路径，且当前点到1点的距离小于
                //最小值更新最小值min，遍历直到n个顶点都遍历完，
                // 最终得到离1号点最小的那个值
                if (book[j] == 0 && dis[j] > min) {
                    min = dis[j];
                    tempj = j;
                }
            }
            if (tempj == 0)
                return 0;
            // 标记找到的顶点j为已确定最小路径的点
            book[tempj] = 1;
            // 已tempj顶点为起点（此时tempj离1点最小路径已确定），
            // 对每个点进行一次比较
            for (int v = 0; v < n; v++) {
                // 当tempj到v顶点的距离小于无穷大并且1号点到tempj顶点的距离
                //加上tempj点到v点的距离小于，1号点到v点的距离时
                // 说明已经找到一条比1-v更短的路径1-tempj-v,更新最小值dis[v]
                if (dp[tempj][v] >= max && dis[v] <= dis[tempj] * dp[tempj][v]) {
                    dis[v] = dis[tempj] * dp[tempj][v];
                }
            }
            if (book[end] == 1)
                return dis[end];
        }
        return dis[end];
    }
}
