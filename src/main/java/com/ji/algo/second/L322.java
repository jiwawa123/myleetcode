package com.ji.algo.second;

import java.util.*;

/**
 * user ji
 * data 2020/8/27
 * time 7:57 上午
 */
public class L322 {
    public static void main(String[] args) {
        String arr[][] = {{"JFK", "SFO"}, {"JFK", "ATL"}, {"SFO", "ATL"}, {"ATL", "JFK"}, {"ATL", "SFO"}};
//        String arr[][] = {{"JFK", "KUL"}, {"JFK", "NRT"}, {"NRT", "JFK"}};
        List<List<String>> list = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(Arrays.asList(arr[i]));
        }
        System.out.println(findItinerary(list));
    }


    //使用广度遍历即可
    private static Map<String, PriorityQueue<String>> map = new HashMap<>();

    private static List<String> resList = new LinkedList<>();

    public static List<String> findItinerary(List<List<String>> tickets) {
        for (List<String> ticket : tickets) {
            String src = ticket.get(0);
            String dst = ticket.get(1);
            if (!map.containsKey(src)) {
                PriorityQueue<String> pq = new PriorityQueue<>();
                map.put(src, pq);
            }
            map.get(src).add(dst);
        }
        dfs("JFK");
        return resList;
    }

    private static void dfs(String src) {
        PriorityQueue<String> pq = map.get(src);
        while (pq != null && !pq.isEmpty())
            dfs(pq.poll());
        ((LinkedList<String>) resList).addFirst(src);
    }
}
