package com.ji.algo.L2201_2250;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Bei Chang
 * @Date: 2023/06/30/21:45
 */
public class MapSum {
    /**
     * Initialize your data structure here.
     */
    Map<String, Integer> map = new HashMap<>();
    Map<String, Integer> mapValues = new HashMap<>();

    public MapSum() {

    }

    public void insert(String key, int val) {
        int m = mapValues.getOrDefault(key, 0);
        for (int i = 1; i <= key.length(); i++) {
            String str = key.substring(0, i);
            int t = map.getOrDefault(str, 0);
            map.put(str, t - m + val);
        }
        mapValues.put(key, val);
    }

    public int sum(String prefix) {
        return map.getOrDefault(prefix, 0);
    }
}
