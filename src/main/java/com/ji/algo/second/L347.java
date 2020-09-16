package com.ji.algo.second;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * user ji
 * data 2020/9/7
 * time 8:12 上午
 */
public class L347 {
    public static void main(String[] args) {

    }

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int t : nums
        ) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }
        Map<Integer, Integer> tmp = new LinkedHashMap<>();
        map.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()
                ).forEachOrdered(e -> tmp.put(e.getKey(), e.getValue()));
        int res[] = new int[k];
        int i = 0;
        for (int key : tmp.keySet()
        ) {
            res[i++] = key;
            if (i == k)
                break;
        }
        return res;
    }
}
