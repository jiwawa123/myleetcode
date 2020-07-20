package com.ji.algo.G0719;

import java.util.*;

/**
 * user ji
 * data 2020/7/19
 * time 10:10 上午
 */
public class G2 {
    public static void main(String[] args) {
        int arr[][] = {{0, 2}, {0, 3}, {1, 2}};
        long t1 = System.currentTimeMillis();
        int a[] = new G2().countSubTrees(4, arr, "aeed");
        System.out.println(System.currentTimeMillis() - t1);
        System.out.println(Arrays.toString(a));
    }

    public int[] countSubTrees(int n, int[][] edges, String labels) {
        int[] res = new int[n];
        char[] chars = labels.toCharArray();
        Set<Integer>[] adj = new Set[n];
        for(int i = 0 ; i <= n - 1; i++){
            adj[i] = new HashSet<>();
        }
        for(int[] edge: edges){
            adj[edge[0]].add(edge[1]);
            adj[edge[1]].add(edge[0]);
        }
        dfs(res, 0, adj, chars, new boolean[n]);
        return res;
    }

    private int[] dfs(int[] ans, int cur, Set<Integer>[] adj, char[] chars, boolean[] seen){
        seen[cur] = true;
        int id = chars[cur] - 'a';
        int[] res = new int[26];
        res[id] = 1;
        ans[cur] = 1;
        for(int next: adj[cur]){
            if(seen[next]){
                continue;
            }
            int[] sub = dfs(ans, next, adj, chars, seen);
            ans[cur] += sub[id];
            for(int i = 0 ; i < 26; i++){
                res[i] += sub[i];
            }
        }
        return res;
    }
}
