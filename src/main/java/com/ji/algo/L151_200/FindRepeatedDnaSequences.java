package com.ji.algo.L151_200;/*
    user ji
    data 2019/7/24
    time 1:39 PM
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindRepeatedDnaSequences {
    public static void main(String[] args) {

    }

    public List<String> findRepeatedDnaSequences(String s) {
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length() - 10; i++) {
            map.put(s.substring(i, i + 10), map.getOrDefault(s.substring(i, i + 10), 0) + 1);
        }
        for (String t : map.keySet()
                ) {
            if (map.get(t) > 1)
                list.add(t);
        }
        return list;
    }
}
