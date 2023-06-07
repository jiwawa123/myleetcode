package com.ji.algo.L2651_2700;

import java.util.*;

/**
 * @Author: Bei Chang
 * @Date: 2023/05/30/20:49
 */
public class L2685 {

    int[] parent, cnt, size;

    public int countCompleteComponents(int n, int[][] edges) {
        parent = new int[n];
        cnt = new int[n];
        size = new int[n];
        Arrays.fill(size, 1);
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        for (int[] e : edges) {
            union(e[0], e[1]);
        }
        boolean[] vis = new boolean[n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int px = find(i);
            if (!vis[px]) {
                vis[px] = true;
                int s = size[px];
                if (cnt[px] == s * (s - 1)) ans++;
            }
        }
        return ans;
    }

    int find(int x) {
        if (parent[x] == x) {
            return x;
        }
        return parent[x] = find(parent[x]);
    }

    void union(int x, int y) {
        int px = find(x), py = find(y);
        if (px != py) {
            parent[px] = py;
            cnt[py] += cnt[px] + 2;
            size[py] += size[px];
        } else {
            cnt[px] += 2;
        }
    }
}
