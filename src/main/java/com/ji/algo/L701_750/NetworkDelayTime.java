package com.ji.algo.L701_750;/*
    user ji
    data 2019/6/30
    time 9:53 AM
*/

import java.util.*;

public class NetworkDelayTime {
    public static void main(String[] args) {

    }

    public int networkDelayTime(int[][] times, int N, int K) {
        Map<Integer, List<int[]>> adj = new HashMap<>();
        int arr[] = new int[N];
        Arrays.fill(arr, -1);
        for (int i = 0; i < times.length; i++) {
            List<int[]> list = adj.getOrDefault(times[i][0] - 1, new ArrayList<>());
            int tmp[] = {times[i][1] - 1, times[i][2]};
            list.add(tmp);
            adj.put(times[i][0] - 1, list);
        }
        dfs(adj, K - 1, 0, arr);
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1)
                return -1;
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public void dfs(Map<Integer, List<int[]>> adj, int k, int times, int arr[]) {
        if (arr[k] != -1 && arr[k] <= times)
            return;
        if (arr[k] == -1 || arr[k] > times) {
            arr[k] = times;
        }

        List<int[]> tmp = adj.getOrDefault(k, new ArrayList<>());
        for (int i = 0; i < tmp.size(); i++) {
            dfs(adj, tmp.get(i)[0], arr[k] + tmp.get(i)[1], arr);
        }
    }
}
