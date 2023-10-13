package com.ji.ready202309;

import java.util.*;

/**
 * @Author: Bei Chang
 * @Date: 2023/09/09/10:57
 */
public class LRUCache {
    public static void main(String[] args) {

    }

    Map<Integer,Integer> map ;
    int size = 0;
    public LRUCache(int capacity) {
        map = new LinkedHashMap();
        size = capacity;
    }

    public int get(int key) {
        if(map.containsKey(key)){
            int tmp = map.get(key);
            map.remove(key);
            map.put(key,tmp);
            return tmp;
        }
        return -1;
    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            map.remove(key);
            map.put(key,value);
            return ;
        }
        if(map.size()<size){
            map.put(key,value);
            return ;
        }
        int index = 0;
        for(int k:map.keySet()){
            index = k;
            break;
        }
        map.remove(index);
        map.put(key,value);
    }
}
