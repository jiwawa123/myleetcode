package com.ji.algo.L1751_1800;

/**
 * user ji
 * data 2021/3/20
 * time 12:21 下午
 */
public class L1791 {
    public static void main(String[] args) {

    }

    public int findCenter(int[][] edges) {
        int a = 0, b = 0;
        for (int i = 0; i < edges.length; i++) {
            if (edges[i][0] == a || edges[i][1] == a)
                return a;
            if (edges[i][0] == b || edges[i][1] == b)
                return b;
            a = edges[i][0];
            b = edges[i][1];
        }
        return a;
    }
}
