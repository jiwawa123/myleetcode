package com.ji.algo.G0531;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * user ji
 * data 2020/5/31
 * time 10:29 上午
 */
public class G3 {
    public static void main(String[] args) {
        int arr[][] = {{1, 0}, {1, 2}, {3, 2}, {3, 4}};
        System.out.println(minReorder(5, arr));
    }

    public static int minReorder(int n, int[][] connections) {
        int res = 0;
        Set<Integer> all = new HashSet<>();
        all.add(0);
        boolean flag[] = new boolean[connections.length];
        for (int i = 0; i < connections.length; i++) {
            int start = connections[i][0];
            int end = connections[i][1];
            if (start == 0) {
                res++;
                all.add(end);
                flag[i] = true;
            }
            if (end == 0) {
                all.add(start);
                flag[i] = true;
            }
        }
        while (all.size() < n) {
            for (int i = 0; i < connections.length; i++) {
                if (flag[i])
                    continue;
                int start = connections[i][0];
                int end = connections[i][1];
                if (all.contains(start)) {
                    res++;
                    all.add(end);
                    flag[i] = true;
                }
                if (all.contains(end)) {
                    all.add(start);
                    flag[i] = true;
                }

            }
        }

        return res;
    }
}
