package com.ji.algo.L1027;/*
    user ji
    data 2019/10/27
    time 10:43 AM
*/

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class G3 {
    public static void main(String[] args) {

    }

    public int maxLength(List<String> arr) {
        String[] tmp = new String[arr.size()];
        int max = 0;
        Map<Integer,Map<Character,Integer>> map = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            String inter = arr.get(i);
            max = Math.max(inter.length(),max);
            Map<Character,Integer> tm = new HashMap<>();
            for (int j = 0; j < inter.length(); j++) {
                tm.put(inter.charAt(j),1);
            }
            map.put(i,tm);
        }

        if(max==26)
            return max;

        return max;
    }
    public boolean helpMatch(Map<Integer,Map<Character,Integer>> map ,int i,int j){
        Map<Character,Integer> a = map.get(i);
        Map<Character,Integer> b = map.get(j);
        for (char t:a.keySet()
             ) {
            if(b.containsKey(t))
                return false;
        }
        return true;
    }
}
