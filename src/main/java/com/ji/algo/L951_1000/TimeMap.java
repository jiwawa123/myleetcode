package com.ji.algo.L951_1000;/*
    user ji
    data 2019/7/18
    time 5:37 PM
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeMap {
    /**
     * Initialize your data structure here.
     */
    Map<String, List<List>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (map.containsKey(key)) {
            List<List> list = map.get(key);
            List<Integer> l1 = list.get(0);
            List<String> l2 = list.get(1);
            l1.add(timestamp);
            l2.add(value);
            map.put(key, list);
        } else {
            List<List> list = new ArrayList<>();
            List<Integer> l1 = new ArrayList<>();
            List<String> l2 = new ArrayList<>();
            l1.add(timestamp);
            l2.add(value);
            list.add(l1);
            list.add(l2);
            map.put(key, list);
        }


    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key))
            return "";
        List<List> list = map.get(key);
        List<Integer> l = list.get(0);
        if (l.get(0) > timestamp)
            return "";
        return list.get(1).get(getIndex(timestamp, l)).toString();
    }

    public int getIndex(int t, List<Integer> l) {
        int i = 0, j = l.size() - 1;
        while (i < j) {
            int med = (j - i) / 2 + i;
            if (l.get(med) == t)
                return med;
            if (l.get(med) < t) {
                i = med + 1;
            } else {
                j = med - 1;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        TimeMap timeMap = new TimeMap();
        timeMap.set("foo","bar",1);
        System.out.println(timeMap.get("foo",1));
        System.out.println(timeMap.get("foo",3));
        timeMap.set("foo","bar2",4);
        System.out.println(timeMap.get("foo",4));
        System.out.println(timeMap.get("foo",5));
    }

}
