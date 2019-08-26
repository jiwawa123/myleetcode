package com.ji.algo.L301_350;/*
    user ji
    data 2019/8/26
    time 9:48 PM
*/

import java.util.*;

public class FindItinerary {
    public static void main(String[] args) {

    }

    private Map<String, PriorityQueue<String>> map = new HashMap<>();

    private List<String> resList = new LinkedList<>();

    public List<String> findItinerary(List<List<String>> tickets) {
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

    private void dfs(String src) {
        PriorityQueue<String> pq = map.get(src);
        while (pq != null && !pq.isEmpty())
            dfs(pq.poll());
        ((LinkedList<String>) resList).addFirst(src);
    }
}
