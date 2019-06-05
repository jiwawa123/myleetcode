package com.ji.algo.L651_700;/*
    user ji
    data 2019/6/5
    time 8:41 AM
*/

import java.util.HashMap;
import java.util.Map;

public class MapSum {
    Map<String, Integer> map = new HashMap<>();

    public MapSum() {

    }

    public void insert(String key, int val) {
        map.put(key, val);
    }

    public int sum(String prefix) {
        int sum = 0;
        for (String str : map.keySet()
                ) {
            if (str.startsWith(prefix)) {
                sum += map.get(str);
            }
        }
        return sum;
    }
}
