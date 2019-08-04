package com.ji.algo.L401_450;/*
    user ji
    data 2019/8/4
    time 9:05 AM
*/

import java.util.HashMap;
import java.util.Map;

public class AllOne {
    Map<String,Integer> map ;
    /** Initialize your data structure here. */
    public AllOne() {
        map = new HashMap();
    }

    /** Inserts a new key <Key> with value 1. Or increments an existing key by 1. */
    public void inc(String key) {
        if(map.containsKey(key))
            map.put(key,map.get(key)+1);
        else
            map.put(key,1);
    }

    /** Decrements an existing key by 1. If Key's value is 1, remove it from the data structure. */
    public void dec(String key) {
        int value = map.getOrDefault(key,0);
        if(value==1){
            map.remove(key);
        }
        else if(value>1)
            map.put(key,value-1);

    }

    /** Returns one of the keys with maximal value. */
    public String getMaxKey() {
        String res = "";
        int value = Integer.MIN_VALUE;
        for(String t:map.keySet()){
            if(map.get(t)>value){
                res = t;
                value = map.get(t);
            }
        }
        return res;
    }

    /** Returns one of the keys with Minimal value. */
    public String getMinKey() {
        String res = "";
        int value = Integer.MAX_VALUE;
        for(String t:map.keySet()){
            if(map.get(t)<value){
                res = t;
                value = map.get(t);
            }
        }
        return res;
    }
}
