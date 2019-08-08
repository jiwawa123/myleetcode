package com.ji.algo.L751_800;/*
    user ji
    data 2019/8/8
    time 1:12 PM
*/

import java.util.HashMap;
import java.util.Map;

public class FindCheapestPrice {
    public static void main(String[] args) {
        int arr[][] = {{0, 1, 100}, {1, 2, 100}, {0, 2, 1000}};
        System.out.println(new FindCheapestPrice().findCheapestPrice(3, arr, 0, 2, 1));
    }

    int max = Integer.MAX_VALUE;
    Map<Integer, Map<Integer, Integer>> map;
    int k;

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        map = new HashMap<>();
        k = K;
        for (int i = 0; i < n; i++) {
            map.put(i, new HashMap<>());
        }
        for (int i = 0; i < flights.length; i++) {
            int tmp[] = flights[i];
            map.get(tmp[0]).put(tmp[1], tmp[2]);
        }
        help(src, 0, 0, dst);
        return max == Integer.MAX_VALUE ? -1 : max;
    }

    public void help(int start, int count, int len, int dst) {

        if (len > k || count > max) {
            return;
        }
        if (start == dst) {
            max = Math.min(count, max);
            return;
        }
        Map<Integer, Integer> path = map.getOrDefault(start,null);
        if (path == null)
            return;
        for (int t : path.keySet()
                ) {
            help(t, count + path.get(t), len + 1, dst);
        }
    }
}
