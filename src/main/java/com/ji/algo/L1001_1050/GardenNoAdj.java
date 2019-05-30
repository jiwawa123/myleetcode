package com.ji.algo.L1001_1050;/*
    user ji
    data 2019/5/30
    time 4:55 PM
*/

import com.sun.org.apache.bcel.internal.generic.FADD;

import java.lang.reflect.Array;
import java.util.*;

public class GardenNoAdj {
    public static void main(String[] args) {
        int arr[][] = {{1, 2}, {2, 3}, {3, 1}};
        System.out.println(gardenNoAdj(3, arr));
    }

    public static int[] gardenNoAdj(int N, int[][] paths) {
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (int i = 0; i < N; i++)
            graph.put(i, new HashSet<>());
        for (int[] path: paths) {
            graph.get(path[0] - 1).add(path[1] - 1);
            graph.get(path[1] - 1).add(path[0] - 1);
        }
        int[] res = new int[N];
        for (int i = 0; i < N; i++) {
            boolean[] used = new boolean[5];
            for (int adj: graph.get(i))
                used[res[adj]] = true;
            for (int j = 1; j <= 4; j++)
                if (!used[j]){
                    res[i] = j;
                    continue;
                }

        }
        return res;
    }
}
