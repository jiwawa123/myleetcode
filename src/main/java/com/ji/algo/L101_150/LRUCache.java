package com.ji.algo.L101_150;/*
    user ji
    data 2019/4/15
    time 8:46 PM
*/

import java.util.*;

public class LRUCache {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < 5; i++) {
            map.put(i, i);
        }
        System.out.println();
    }

    Map<Integer, Integer> map = new LinkedHashMap<>();
    int max = 0;

    public LRUCache(int capacity) {
        max = capacity;
    }

    public int get(int key) {
        if (map.containsKey(key)) {

            int value = map.get(key);
            map.remove(key);
            map.put(key,value);
            return value;
        }
        return -1;

    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            map.remove(key);
        }
        if (map.size() < max) {
            map.put(key, value);
            return;
        } else {
            for (int k : map.keySet()
                    ) {
                map.remove(k);
                break;
            }
            map.put(key, value);
            return;
        }

    }
}
