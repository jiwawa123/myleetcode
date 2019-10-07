package com.ji.algo.game;/*
    user ji
    data 2019/10/7
    time 9:43 AM
*/

import java.util.Map;
import java.util.TreeMap;

public class Skiplist {
    Map<Integer,Integer> map;
    public Skiplist() {
        map = new TreeMap();
    }

    public boolean search(int target) {
        return map.containsKey(target);
    }

    public void add(int num) {
        map.put(num,map.getOrDefault(num,0)+1);
    }

    public boolean erase(int num) {
        if(!map.containsKey(num)){
            return false;
        }else{
            if(map.get(num)==1){
                map.remove(num);
            }else{
                map.put(num,map.get(num)-1);
            }
            return true;
        }
    }
}
