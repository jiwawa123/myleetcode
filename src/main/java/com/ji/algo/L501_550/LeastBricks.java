package com.ji.algo.L501_550;/*
    user ji
    data 2019/7/16
    time 7:59 PM
*/

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeastBricks {
    public static void main(String[] args) {

    }

    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> map = new HashMap<>();
        int all = wall.size();
        for (int i = 0; i < all; i++) {
            int count = 0;
            for (int j = 0; j < wall.get(i).size() - 1; j++) {
                count += wall.get(i).get(j);
                map.put(count, map.getOrDefault(count, 0) + 1);
            }
        }
        int max = 0;
        for (int t : map.values()) {
            max = Math.max(t, max);
        }

        return all - max;
    }
}
