package com.ji.algo.L1751_1800;

import java.util.*;

/**
 * user ji
 * data 2021/4/17
 * time 11:00 下午
 */
public class L1765 {
    public static void main(String[] args) {
        int arr[][] = {{0, 1}, {0, 0}};
        highestPeak(arr);
    }

    public static int[][] highestPeak(int[][] isWater) {
        int m = isWater.length;
        int n = isWater[0].length;
        int res[][] = new int[m][n];
        for (int i = 0; i < m; i++) { // 预先填充
            Arrays.fill(res[i], -1);
        }
        int count = 0;
        int level = 0;
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isWater[i][j] == 1) { // 将周围四个角填充
                    res[i][j] = 0;
                    Set<Integer> tmp = map.getOrDefault(i, new HashSet<>());
                    tmp.add(j);
                    map.put(i, tmp);
                    count++;
                }
            }
        }
        while (count < n * m) {
            level++;
            Map<Integer, Set<Integer>> next = new HashMap<>();
            for (Map.Entry<Integer, Set<Integer>> entry : map.entrySet()
            ) {
                for (int t : entry.getValue()
                ) {
                    count += help(entry.getKey(), t, res, next, level);
                }
            }
            map = next;
        }
        return res;
    }

    public static int help(int x, int y, int[][] res, Map<Integer, Set<Integer>> next, int level) {
        int count = 0;
        if (x > 0) {
            if (res[x - 1][y] == -1) {
                res[x - 1][y] = level;
                count++;
                Set<Integer> set = next.getOrDefault(x - 1, new HashSet<>());
                set.add(y);
                next.put(x - 1, set);
            }
        }
        if (y > 0) {
            if (res[x][y - 1] == -1) {
                res[x][y - 1] = level;
                count++;
                Set<Integer> set = next.getOrDefault(x, new HashSet<>());
                set.add(y - 1);
                next.put(x, set);
            }
        }
        if (x < res.length - 1) {
            if (res[x + 1][y] == -1) {
                res[x + 1][y] = level;
                count++;
                Set<Integer> set = next.getOrDefault(x + 1, new HashSet<>());
                set.add(y);
                next.put(x + 1, set);
            }
        }
        if (y < res[0].length - 1) {
            if (res[x][y + 1] == -1) {
                res[x][y + 1] = level;
                count++;
                Set<Integer> set = next.getOrDefault(x, new HashSet<>());
                set.add(y + 1);
                next.put(x, set);
            }
        }
        return count;
    }
}
