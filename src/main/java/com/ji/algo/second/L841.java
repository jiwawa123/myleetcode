package com.ji.algo.second;

import java.util.*;

/**
 * user ji
 * data 2020/8/31
 * time 8:06 上午
 */
public class L841 {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();

        list.add(Arrays.asList(1));
        list.add(Arrays.asList(2));
        list.add(Arrays.asList(3));
        list.add(Arrays.asList());

        new L841().canVisitAllRooms(list);

    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> set = new HashSet<>();
        bfs(set, rooms, 0);
        return set.size() == rooms.size();
    }

    public void bfs(Set<Integer> set, List<List<Integer>> rooms, int start) {
        if (set.contains(start))
            return;
        set.add(start);
        List<Integer> next = rooms.get(start);
        for (int t : next
        ) {
            bfs(set, rooms, t);
        }
    }
}
