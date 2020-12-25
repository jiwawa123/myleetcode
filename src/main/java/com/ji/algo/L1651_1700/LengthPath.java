package com.ji.algo.L1651_1700;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * user ji
 * data 2020/12/21
 * time 8:36 下午
 */

public class LengthPath {
    public static void main(String[] args) {
        LengthPath lengthPath = new LengthPath();
        int arr[][] = {{1, 2}, {2, 3}, {2, 4}, {4, 5}};
        System.out.println(lengthPath.getLengthPath(5, arr));
    }

    int max = 0;
    int start = 0;

    public int getLengthPath(int n, int paths[][]) {
        Set<Integer>[] set = new HashSet[n + 1];
        for (int i = 0; i <= n; i++) {
            set[i] = new HashSet<>();
        }
        for (int i = 0; i < paths.length; i++) {
            int start = paths[i][0];
            int end = paths[i][1];
            set[start].add(end);
            set[end].add(start);
        }

        // 找出一个端点
        boolean flag[] = new boolean[n + 1];
        dfs(1, flag, 0, set);
        // 从一个端点找出最远的路径
        max = 0;
        Arrays.fill(flag, false);
        dfs(start, flag, 0, set);
        return max;
    }


    public void dfs(int start, boolean flag[], int len, Set<Integer>[] set) {
        if (flag[start]) {
            return;
        }
        if (max < len) {
            max = len;
            this.start = start;
        }
        flag[start] = true;
        for (int k : set[start]
        ) {
            dfs(k, flag, len + 1, set);
        }
    }
}
